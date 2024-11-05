import java.util.*;

class Aresta implements Comparable<Aresta> {
    int vertice;
    int peso;

    // Construtor da aresta
    public Aresta(int vertice, int peso) {
        this.vertice = vertice;
        this.peso = peso;
    }

    // Método para comparar arestas (com base no peso)
    public int compareTo(Aresta outra) {
        return this.peso - outra.peso;
    }
}

public class PRIM {
    private int numVertices; // Número de vértices no grafo
    private List<List<Aresta>> adjacencias; // Lista de adjacências

    // Construtor para inicializar o grafo com um número fixo de vértices
    public PRIM(int numVertices) {
        this.numVertices = numVertices;
        adjacencias = new ArrayList<>();
        
        for (int i = 0; i < numVertices; i++) {
            adjacencias.add(new ArrayList<>());
        }
    }

    // Método para adicionar uma aresta ao grafo
    public void addAresta(int origem, int destino, int peso) {
        adjacencias.get(origem).add(new Aresta(destino, peso));
        adjacencias.get(destino).add(new Aresta(origem, peso)); // Grafo não-direcionado
    }

    // Implementação do Algoritmo de Prim para encontrar a árvore geradora mínima
    public void primMST() {
        // Array para marcar vértices visitados
        boolean[] visitado = new boolean[numVertices];
        // Fila de prioridade para selecionar a aresta de menor peso
        PriorityQueue<Aresta> pq = new PriorityQueue<>();
        
        // Começamos do vértice 0 (pode ser qualquer vértice)
        pq.add(new Aresta(0, 0)); // Peso 0 para o primeiro vértice

        int custoTotal = 0;
        
        while (!pq.isEmpty()) {
            Aresta aresta = pq.poll();
            int vertice = aresta.vertice;

            // Ignora o vértice se ele já foi visitado
            if (visitado[vertice]) continue;
            
            // Marca o vértice como visitado e adiciona o custo
            visitado[vertice] = true;
            custoTotal += aresta.peso;

            System.out.println("Aresta escolhida: " + vertice + " com peso " + aresta.peso);

            // Para cada aresta adjacente, adiciona à fila se o destino ainda não foi visitado
            for (Aresta adj : adjacencias.get(vertice)) {
                if (!visitado[adj.vertice]) {
                    pq.add(adj);
                }
            }
        }

        System.out.println("Custo total da árvore geradora mínima: " + custoTotal);
    }

    public static void main(String[] args) {
        PRIM grafo = new PRIM(5);

        // Adiciona arestas com pesos
        grafo.addAresta(0, 1, 2);
        grafo.addAresta(0, 3, 6);
        grafo.addAresta(1, 2, 3);
        grafo.addAresta(1, 3, 8);
        grafo.addAresta(1, 4, 5);
        grafo.addAresta(2, 4, 7);
        grafo.addAresta(3, 4, 9);

        System.out.println("Árvore Geradora Mínima usando o Algoritmo de Prim:");
        grafo.primMST();
    }
}

