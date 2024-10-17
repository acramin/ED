public class Ex1_MedeTempo {
    public static void main(String[] args) {

      long startTime = System.nanoTime();
      int N[] = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};

      for(int x : N){
        int vetor[] = new int[x];
        for(int i = 0; i < x; i++){
          vetor[i] = 0;
        }
        System.out.println("Vetor de " + x + " posicoes criado.");
        long endTime  = System.nanoTime();
        long timeElapsed = endTime - startTime;
              
        System.out.println("Tempo de Execucao em Nanosegundos: " + timeElapsed);
        System.out.println("Tempo de Execucao em Microsegundos: " + timeElapsed / 1000);
        System.out.println("Tempo de Execucao em Milisegundos: " + timeElapsed / 1000 / 1000);
        System.out.println("Tempo de Execucao em Segundos: " + timeElapsed / 1000 / 1000 / 1000);
      }
		}
}
