package codigos1;

public class ArrayRagged {
    public static void main(String[] args) {
        int NMAX = 5;
        int [][] matriz_triangular = new int[NMAX + 1] [];
        for (int n=0; n <= NMAX ; n++ )
            matriz_triangular[n] = new int[n+1];
        for (int n=0; n<matriz_triangular.length; n++) { 
            for (int k=0; k < matriz_triangular[n].length; k++) {
            matriz_triangular[n][k] = 
            (int) (10* Math.random());
            System.out.print(" " + matriz_triangular[n][k]);
            }
        System.out.println("");
        }
    } 
}
