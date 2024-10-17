public class Ex4 {
    public static void main(String[] args) {
        int[] N = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
        boolean simetria = true;

        for (int j = 0; j < 10; j++){
            double[][] matriz = new double[N[j]][N[j]];
            for (int i = 0; i < N[j]; i++) {
                for (int k = 0; k < N[j]; k++) {
                    matriz[i][k] = -1;
                }
            }

            for (int l = 0; l < N[j]; l++) {
                for (int p = 0; p < N[j]; p++) {
                    if (matriz[l][p] != matriz[p][l]){
                        simetria = false;
                    }
                }
            }
            //System.out.println("A simetria da matriz é: " + simet);
        }
    }
}