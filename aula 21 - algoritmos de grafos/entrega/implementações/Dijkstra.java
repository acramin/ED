import java.util.*;

class Aresta {
    int destino, peso;

    // Construtor da classe Aresta
    public Aresta(int destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }
}

class Dijkstra {
    private int numVertices;
    private List<List<Aresta>> adj;

    // Construtor do grafo
    public Dijkstra(int numVertices) {
        this.numVertices = numVertices;
        adj = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Adiciona uma aresta ao grafo
    public void addAresta(int origem, int destino, int peso) {
        adj.get(origem).add(new Aresta(destino, peso));
        adj.get(destino).add(new Aresta(origem, peso)); // Para grafos não direcionados
    }

    // Implementação do algoritmo de Dijkstra
    public void dijkstra_alg(int origem) {
        int[] dist = new int[numVertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[origem] = 0;

        // Fila de prioridade para armazenar vértices e suas distâncias
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[] { origem, 0 });

        while (!pq.isEmpty()) {
            int[] atual = pq.poll();
            int u = atual[0];
            int distanciaAtual = atual[1];

            // Ignorar se a distância atual é maior que a conhecida
            if (distanciaAtual > dist[u]) continue;

            // Processa os vizinhos
            for (Aresta vizinho : adj.get(u)) {
                int v = vizinho.destino;
                int peso = vizinho.peso;

                // Verifica se uma rota mais curta foi encontrada
                if (dist[u] + peso < dist[v]) {
                    dist[v] = dist[u] + peso;
                    pq.add(new int[] { v, dist[v] });
                }
            }
        }

        // Exibe as distâncias mínimas a partir do vértice origem
        System.out.println("Distâncias mínimas a partir do vértice " + origem + ":");
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Vértice " + i + " : " + dist[i]);
        }
    }

    public static void main(String[] args) {
        Dijkstra grafo = new Dijkstra(5);

        // Adiciona arestas com pesos
        grafo.addAresta(0, 1, 2);
        grafo.addAresta(0, 2, 4);
        grafo.addAresta(1, 2, 1);
        grafo.addAresta(1, 3, 7);
        grafo.addAresta(2, 4, 3);
        grafo.addAresta(3, 4, 1);

        System.out.println("Algoritmo de Dijkstra:");
        grafo.dijkstra_alg(0); // Calcula as menores distâncias a partir do vértice 0
    }
}
