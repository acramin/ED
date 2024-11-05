import java.util.*;

class Aresta implements Comparable<Aresta> {
    int origem, destino, peso;

    // Construtor da classe Aresta
    public Aresta(int origem, int destino, int peso) {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    // Método para comparar arestas (para ordenação por peso)
    public int compareTo(Aresta outra) {
        return this.peso - outra.peso;
    }
}

class UnionFind {
    private int[] pai, rank;

    // Inicializa o Union-Find para `n` elementos
    public UnionFind(int n) {
        pai = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            pai[i] = i;
            rank[i] = 0;
        }
    }

    // Encontra a raiz do elemento `i` com compressão de caminho
    public int find(int i) {
        if (pai[i] != i) {
            pai[i] = find(pai[i]);
        }
        return pai[i];
    }

    // Une dois conjuntos pela altura
    public void union(int x, int y) {
        int raizX = find(x);
        int raizY = find(y);

        if (raizX != raizY) {
            if (rank[raizX] < rank[raizY]) {
                pai[raizX] = raizY;
            } else if (rank[raizX] > rank[raizY]) {
                pai[raizY] = raizX;
            } else {
                pai[raizY] = raizX;
                rank[raizX]++;
            }
        }
    }
}

public class Kruskal {
    private int numVertices;
    private List<Aresta> arestas;

    // Construtor do grafo
    public Kruskal(int numVertices) {
        this.numVertices = numVertices;
        arestas = new ArrayList<>();
    }

    // Método para adicionar uma aresta ao grafo
    public void addAresta(int origem, int destino, int peso) {
        arestas.add(new Aresta(origem, destino, peso));
    }

    // Implementação do Algoritmo de Kruskal
    public void kruskalMST() {
        // Ordena todas as arestas pelo peso
        Collections.sort(arestas);

        // Cria uma estrutura Union-Find para gerenciar os conjuntos
        UnionFind uf = new UnionFind(numVertices);

        int custoTotal = 0;
        List<Aresta> mst = new ArrayList<>();

        for (Aresta aresta : arestas) {
            int origem = aresta.origem;
            int destino = aresta.destino;

            // Verifica se a aresta conecta dois componentes distintos
            if (uf.find(origem) != uf.find(destino)) {
                mst.add(aresta); // Adiciona a aresta na MST
                custoTotal += aresta.peso;
                uf.union(origem, destino); // Une os conjuntos

                System.out.println("Aresta (" + origem + " - " + destino + ") com peso " + aresta.peso);
            }
        }

        System.out.println("Custo total da árvore geradora mínima: " + custoTotal);
    }

    public static void main(String[] args) {
        Kruskal grafo = new Kruskal(5);

        // Adiciona arestas com pesos
        grafo.addAresta(0, 1, 2);
        grafo.addAresta(0, 3, 6);
        grafo.addAresta(1, 2, 3);
        grafo.addAresta(1, 3, 8);
        grafo.addAresta(1, 4, 5);
        grafo.addAresta(2, 4, 7);
        grafo.addAresta(3, 4, 9);

        System.out.println("Árvore Geradora Mínima usando o Algoritmo de Kruskal:");
        grafo.kruskalMST();
    }
}
