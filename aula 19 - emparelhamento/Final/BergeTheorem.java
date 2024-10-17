package Final;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BergeTheorem {

    // Classe para representar um grafo bipartido
    static class Graph {
        private final int V; // Número de vértices
        private final List<List<Integer>> adj; // Lista de adjacência

        // Construtor do grafo
        public Graph(int V) {
            this.V = V;
            adj = new ArrayList<>(V);
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        // Método para adicionar uma aresta ao grafo
        public void addEdge(int u, int v) {
            adj.get(u).add(v);
        }

        // Retorna verdadeiro se houver um emparelhamento aumentado para o vértice u
        private boolean bpm(int u, boolean[] seen, int[] matchR) {
            for (int v : adj.get(u)) {
                // Se v não foi visitado
                if (!seen[v]) {
                    seen[v] = true; // Marca v como visitado

                    // Se v não está emparelhado ou o vértice emparelhado com v pode encontrar outro
                    if (matchR[v] < 0 || bpm(matchR[v], seen, matchR)) {
                        matchR[v] = u;
                        return true;
                    }
                }
            }
            return false;
        }

        // Método para encontrar o emparelhamento máximo
        public int maxBipartiteMatching(int[] matchR) {
            // Inicialmente nenhum vértice está emparelhado
            Arrays.fill(matchR, -1);

            int result = 0; // Contador para o número de emparelhamentos encontrados
            for (int u = 0; u < V; u++) {
                // Vértices visitados são resetados para cada nó u
                boolean[] seen = new boolean[V];
                // Se o vértice u pode ser emparelhado
                if (bpm(u, seen, matchR)) {
                    result++;
                }
            }
            return result;
        }

        public void printMatchings(int[] matchR) {
            System.out.println("Emparelhamentos encontrados:");
            for (int v = 0; v < V; v++) {
                if (matchR[v] != -1) {
                    System.out.println(" " + matchR[v] + " - " + v);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Graph g = new Graph(12); // Grafo bipartido com 6 vértices

        // Adiciona arestas
        g.addEdge(0, 6); // A - 1
        g.addEdge(0, 7); // A - 2
        g.addEdge(0, 9); // A - 4
        g.addEdge(1, 7); // B - 2
        g.addEdge(1, 11); // B - 6
        g.addEdge(2, 7); // C - 2
        g.addEdge(2, 8); // C - 3
        g.addEdge(3, 8); // D - 3
        g.addEdge(3, 10); // D - 5
        g.addEdge(3, 11); // D - 6
        g.addEdge(4, 8); // E - 3
        g.addEdge(4, 9); // E - 4
        g.addEdge(4, 10); // E - 5
        g.addEdge(4, 11); // E - 6
        g.addEdge(5, 7); // F - 2
        g.addEdge(5, 10); // F - 5

        int[] matchR = new int[12]; // Armazena os emparelhamentos
        int maxMatching = g.maxBipartiteMatching(matchR);
        System.out.println("O emparelhamento máximo é " + maxMatching);

        // Exibe os emparelhamentos encontrados
        g.printMatchings(matchR);
    }
}