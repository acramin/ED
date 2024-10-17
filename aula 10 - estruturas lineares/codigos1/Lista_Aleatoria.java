package codigos1;

public class Lista_Aleatoria {
    public static void main(String[] args) {
        int[] x = new int[5]; 
        for (int i=0; i<x.length ; i++) { 
            x[i] = (int)(100.0 * Math.random()); 
            System.out.print(" " + x[i]); 
        } 
    }
}

