import java.util.*;

public class Mapa {
    private ArrayList<Local> nos;
    private ArrayList<Rota> rotas;
    private Map<Local, List<Rota>> adjacencias;
     // Mapa de adjacências para facilitar busca de rotas

    public Mapa() {
        nos = new ArrayList<>();
        rotas = new ArrayList<>();
        adjacencias = new HashMap<>();
    }

    public ArrayList<Local> getNos() {
        return nos;
    }

    public ArrayList<Rota> getRotas() {
        return rotas;
    }

    public void addNo(Local no) {
        nos.add(no);
        adjacencias.putIfAbsent(no, new ArrayList<>());
    }

    public void addRota(Rota rota) {
        rotas.add(rota);
        
        // Adiciona a rota nas listas de adjacências para origem e destino
        adjacencias.get(rota.getOrigem()).add(rota);
    }

    // Implementação do algoritmo de Dijkstra para encontrar a menor distância entre origem e destino
    public Resultado calculaMenorDistancia(Local origem, Local destino) {
        Map<Local, Double> distancias = new HashMap<>();
        Map<Local, Local> antecessores = new HashMap<>(); // Para reconstruir o caminho
        for (Local no : nos) {
            distancias.put(no, Double.POSITIVE_INFINITY);
        }
        distancias.put(origem, 0.0);

        PriorityQueue<Local> filaPrioridade = new PriorityQueue<>(Comparator.comparingDouble(distancias::get));
        filaPrioridade.add(origem);

        while (!filaPrioridade.isEmpty()) {
            Local atual = filaPrioridade.poll();

            // Se chegarmos ao destino, retornamos a distância e o caminho
            if (atual.equals(destino)) {
                return new Resultado(distancias.get(destino), reconstruaCaminho(antecessores, origem, destino));
            }

            // Para cada rota do nó atual, verificamos se conseguimos um caminho mais curto
            for (Rota rota : adjacencias.get(atual)) {
                Local vizinho = rota.getDestino();
                double novaDistancia = distancias.get(atual) + rota.getDistancia();

                if (novaDistancia < distancias.get(vizinho)) {
                    distancias.put(vizinho, novaDistancia);
                    antecessores.put(vizinho, atual); // Armazena o nó anterior
                    filaPrioridade.add(vizinho);
                }
            }
        }
        return new Resultado(Double.POSITIVE_INFINITY, new ArrayList<>()); // Caso não exista caminho
    }

    private List<Local> reconstruaCaminho(Map<Local, Local> antecessores, Local origem, Local destino) {
        List<Local> caminho = new LinkedList<>();
        for (Local no = destino; no != null; no = antecessores.get(no)) {
            caminho.add(no);
        }
        Collections.reverse(caminho); // Inverte o caminho para a ordem correta
        return caminho;
    }

    public static class Resultado {
        private double distancia;
        private List<Local> caminho;

        public Resultado(double distancia, List<Local> caminho) {
            this.distancia = distancia;
            this.caminho = caminho;
        }

        public double getDistancia() {
            return distancia;
        }

        public List<Local> getCaminho() {
            return caminho;
        }

        @Override
        public String toString() {
            return "Distância: " + distancia + ", Caminho: " + caminho;
        }
    }


}
