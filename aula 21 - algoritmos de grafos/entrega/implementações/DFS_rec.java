import java.util.ArrayList;
import java.util.List;

public class DFS_rec {
    private int numVertices; // Número de vértices
    private List<List<Integer>> adjacencias; // Lista de adjacências

    // Construtor para inicializar o grafo com um número fixo de vértices
    public DFS_rec(int numVertices) {
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

    // Método auxiliar de DFS recursiva
    private void dfsUtil(int vertice, boolean[] visitado) {
        // Marca o vértice como visitado e exibe ele
        visitado[vertice] = true;
        System.out.print(vertice + " ");

        // Para cada vértice adjacente
        for (int adjacente : adjacencias.get(vertice)) {
            // Se ainda não foi visitado, chama a DFS para ele
            if (!visitado[adjacente]) {
                dfsUtil(adjacente, visitado);
            }
        }
    }

    // Método público para chamar a DFS a partir de um vértice inicial
    public void dfs(int verticeInicial) {
        // Marca todos os vértices como não visitados inicialmente
        boolean[] visitado = new boolean[numVertices];
        // Chama a função auxiliar de DFS para o vértice inicial
        dfsUtil(verticeInicial, visitado);
    }

    public static void main(String[] args) {
        DFS_rec grafo = new DFS_rec(5); // Cria um grafo com 5 vértices
        
        // Adiciona arestas
        grafo.addAresta(0, 1);
        grafo.addAresta(0, 2);
        grafo.addAresta(1, 3);
        grafo.addAresta(2, 4);
        
        System.out.println("Busca em profundidade iniciando no vértice 0:");
        grafo.dfs(0); // Realiza DFS a partir do vértice 0
    }
}
