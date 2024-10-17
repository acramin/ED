package Resto;
import java.util.*;

public class MaximalMatching {

    // Função principal para encontrar o emparelhamento máximo
    public static Set<Edge> EmparelhamentoMaximo(Graph G) {
        Set<Edge> M = new HashSet<>(); // Inicializa o conjunto de emparelhamentos
        for (Vertex v : G.vertices()) { // Para cada vértice em G
            if (!isCovered(v, M)) { // Se v não está coberto por M
                List<Edge> C = CaminhoAumentante(G, M, v); // Caminho Aumentante
                if (!C.isEmpty()) { // Se o caminho C não está vazio
                    M = symmetricDifference(M, C); // Atualiza M com M ⊕ C
                }
            }
        }
        return M;
    }

    // Função auxiliar para encontrar um caminho aumentante
    public static List<Edge> CaminhoAumentante(Graph G, Set<Edge> M, Vertex v) {
        Set<Vertex> T = new HashSet<>();
        Set<Vertex> P = new HashSet<>();
        T.add(v);
        P.add(v);

        while (!getUnvisitedNeighbors(G, P, T).isEmpty()) {
            Vertex w = getUnvisitedNeighbor(G, P, T);
            T.add(w);

            Vertex u = getNeighbor(G, w, T);
            if (u != null) {
                T.add(u);
                Edge uw = new Edge(u, w);
                if (!isCovered(u, M)) { // Se u não está coberto por M
                    return constructPath(v, T, w); // Devolve o caminho vTw
                }
            } else {
                Edge wt = getCoveringEdge(w, M);
                if (wt != null) {
                    T.add(wt.otherVertex(w)); // Adiciona o outro vértice coberto pela aresta
                    P.add(wt.otherVertex(w));
                }
            }
        }

        return new ArrayList<>(); // Se não encontrar caminho aumentante, devolve vazio
    }

    // Funções auxiliares:
    
    // Verifica se um vértice está coberto por M
    public static boolean isCovered(Vertex v, Set<Edge> M) {
        for (Edge e : M) {
            if (e.contains(v)) {
                return true;
            }
        }
        return false;
    }

    // Diferença simétrica entre o conjunto de arestas
    public static Set<Edge> symmetricDifference(Set<Edge> M, List<Edge> C) {
        Set<Edge> result = new HashSet<>(M);
        for (Edge e : C) {
            if (result.contains(e)) {
                result.remove(e);
            } else {
                result.add(e);
            }
        }
        return result;
    }

    // Retorna os vizinhos não visitados de P em G
    public static Set<Vertex> getUnvisitedNeighbors(Graph G, Set<Vertex> P, Set<Vertex> T) {
        Set<Vertex> neighbors = new HashSet<>();
        for (Vertex v : P) {
            for (Vertex neighbor : G.getNeighbors(v)) {
                if (!T.contains(neighbor)) {
                    neighbors.add(neighbor);
                }
            }
        }
        return neighbors;
    }

    // Retorna um vizinho não visitado
    public static Vertex getUnvisitedNeighbor(Graph G, Set<Vertex> P, Set<Vertex> T) {
        for (Vertex v : P) {
            for (Vertex neighbor : G.getNeighbors(v)) {
                if (!T.contains(neighbor)) {
                    return neighbor;
                }
            }
        }
        return null;
    }

    // Retorna o vizinho de w que já está em T
    public static Vertex getNeighbor(Graph G, Vertex w, Set<Vertex> T) {
        for (Vertex neighbor : G.getNeighbors(w)) {
            if (T.contains(neighbor)) {
                return neighbor;
            }
        }
        return null;
    }

    // Retorna a aresta que cobre w em M
    public static Edge getCoveringEdge(Vertex w, Set<Edge> M) {
        for (Edge e : M) {
            if (e.contains(w)) {
                return e;
            }
        }
        return null;
    }

    // Constrói o caminho vTw
    public static List<Edge> constructPath(Vertex v, Set<Vertex> T, Vertex w) {
        List<Edge> path = new ArrayList<>();
        // Caminho pode ser construído de acordo com T e w
        // Exemplo básico para ilustração
        for (Vertex t : T) {
            path.add(new Edge(t, w));
        }
        return path;
    }
}