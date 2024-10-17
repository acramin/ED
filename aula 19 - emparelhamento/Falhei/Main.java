package Resto;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Cria um grafo bipartido
        Graph G = new Graph();

        // Conjunto U
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");

        // Conjunto V
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");

        // Adiciona os vértices ao grafo
        G.addVertex(v1);
        G.addVertex(v2);
        G.addVertex(v3);
        G.addVertex(v4);
        G.addVertex(v5);
        G.addVertex(v6);

        // Adiciona arestas entre os conjuntos U e V (grafo bipartido)
        G.addEdge(v1, v4); // Aresta entre vértice 1 (U) e 4 (V)
        G.addEdge(v1, v5); // Aresta entre vértice 1 (U) e 5 (V)
        G.addEdge(v2, v5); // Aresta entre vértice 2 (U) e 5 (V)
        G.addEdge(v2, v6); // Aresta entre vértice 2 (U) e 6 (V)
        G.addEdge(v3, v6); // Aresta entre vértice 3 (U) e 6 (V)
        G.addEdge(v3, v4); // Aresta entre vértice 3 (U) e 4 (V)

        // Encontra o emparelhamento máximo
        /*Set<Edge> emparelhamentoMaximo = MaximalMatching.EmparelhamentoMaximo(G);
        System.out.println("teste:\n"+emparelhamentoMaximo.size());

        // Imprime o emparelhamento máximo
        System.out.println("Emparelhamento Máximo:");
        for (Edge e : emparelhamentoMaximo) {
            System.out.println(e.u.label + " - " + e.v.label);
        }*/
    }
}
