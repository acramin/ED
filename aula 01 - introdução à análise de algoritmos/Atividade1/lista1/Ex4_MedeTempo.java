public class Ex4_MedeTempo {
    public static void main(String[] args) {
        //int N[]  = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 50000};

        int N = 100000;
        boolean simetria = true;

        long startTime = System.nanoTime();

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

        long endTime  = System.nanoTime();
        long timeElapsed = endTime - startTime;
        
        System.out.println("Tempo de Execucao em Nanosegundos: " + timeElapsed);
        System.out.println("Tempo de Execucao em Microsegundos: " + timeElapsed / 1000);
        System.out.println("Tempo de Execucao em Milisegundos: " + timeElapsed / 1000 / 1000);
        System.out.println("Tempo de Execucao em Segundos: " + timeElapsed / 1000 / 1000 / 1000);
    }
}
