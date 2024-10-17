/**
 * Ex4
 */
public class Ex4 {
    public static void main(String[] args) {
        //int N[]  = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 50000};

        int N = 10;
        boolean simetria = true;

		int matriz[][] = new int[N][N];
		for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j ++){
                matriz[i][j] = 0;
            }
		}

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j ++){
                if(matriz[i][j] != matriz[j][i]){
                    simetria = false;
                }
            }
        }
        System.out.println("Simétrica? " + simetria);
    }
}

//NÃO TA PRONTO