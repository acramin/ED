import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS_int {
    private int numVertices; // Número de vértices
    private List<List<Integer>> adjacencias; // Lista de adjacências

    // Construtor para inicializar o grafo com um número fixo de vértices
    public DFS_int(int numVertices) {
        this.numVertices = numVertices;
        adjacencias = new ArrayList<>();
        
        // Inicializa a lista de adjacências
        for (int i = 0; i < numVertices; i++) {
            adjacencias.add(new ArrayList<>());
        }
    }

    // Método para adicionar uma aresta ao grafo
    public void addAresta(int origem, int destino) {
        adjacencias.get(origem).add(destino);
        adjacencias.get(destino).add(origem); // Grafo não-direcionado
    }

    // Método de DFS iterativa usando uma pilha
    public void dfsIterativo(int verticeInicial) {
        // Cria um array para marcar os vértices visitados
        boolean[] visitado = new boolean[numVertices];
        // Cria uma pilha para gerenciar a exploração dos vértices
        Stack<Integer> pilha = new Stack<>();

        // Adiciona o vértice inicial à pilha
        pilha.push(verticeInicial);

        while (!pilha.isEmpty()) {
            // Remove o vértice do topo da pilha
            int vertice = pilha.pop();

            // Se o vértice ainda não foi visitado
            if (!visitado[vertice]) {
                // Marca como visitado e exibe ele
                visitado[vertice] = true;
                System.out.print(vertice + " ");
            }

            // Adiciona todos os vizinhos não visitados do vértice à pilha
            for (int adjacente : adjacencias.get(vertice)) {
                if (!visitado[adjacente]) {
                    pilha.push(adjacente);
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS_int grafo = new DFS_int(5); // Cria um grafo com 5 vértices
        
        // Adiciona arestas
        grafo.addAresta(0, 1);
        grafo.addAresta(0, 2);
        grafo.addAresta(1, 3);
        grafo.addAresta(2, 4);
        
        System.out.println("Busca em profundidade (iterativa) iniciando no vértice 0:");
        grafo.dfsIterativo(0); // Realiza DFS a partir do vértice 0
    }
}

