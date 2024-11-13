public class Local {
    String nome;
    private int x, y;

    public Local(String nome, int x, int y) {
        this.x = x;
        this.y = y;
        this.nome = nome;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " (" + x + ", " + y + ")";
    }
}

    
