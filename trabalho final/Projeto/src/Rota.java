public class Rota {
    private Local origem;
    private Local destino;
    private double distancia; 

    // Construtor que calcula a distância com base nas coordenadas
    public Rota(Local origem, Local destino) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = calculaDistancia();
    }

    public Local getOrigem() {
        return origem;
    }

    public Local getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }


    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    // Calcula a distância entre as coordenadas dos locais de origem e destino
    private double calculaDistancia() {
        return Math.sqrt(Math.pow(origem.getX() - destino.getX(), 2) + Math.pow(origem.getY() - destino.getY(), 2));
    }
}
