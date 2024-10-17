public class Ex3_MedeTempo {
    public static void main(String[] args) {
        
        int N = 50000;  // 10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000
		int M = 25000;  // 10, 75, 300, 200, 1000, 7000, 1,     25000, 100000, 1000

        long startTime = System.nanoTime();

        double matriz[][] = new double[N][M];
        for(int i = 0; i < N; i++){
		    for(int j = 0; j < matriz[i].length; j ++){
		        matriz[i][j] = -1;
		    }
		}
		System.out.println("Matriz de " + N + " x " + M + " foi limpa.");
        long endTime  = System.nanoTime();
        long timeElapsed = endTime - startTime;
        
        System.out.println("Tempo de Execucao em Nanosegundos: " + timeElapsed);
        System.out.println("Tempo de Execucao em Microsegundos: " + timeElapsed / 1000);
        System.out.println("Tempo de Execucao em Milisegundos: " + timeElapsed / 1000 / 1000);
        System.out.println("Tempo de Execucao em Segundos: " + timeElapsed / 1000 / 1000 / 1000);


    }
}
