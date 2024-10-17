
public class Ex2_MedeTempo {
    
    public static void main(String[] args) {
        int N[]  = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
		
		for(int x : N){
		    long startTime = System.nanoTime();
		    int vetor_original[] = new int[x];
		    int vetor_copia[] = new int[x];
		    
		    for(int i = 0; i < x; i++){
		        vetor_original[i] = 0;
		    }
		    
		    for(int j = 0; j < x; j ++){
		        vetor_copia[j] = vetor_original[j];
		    }
		    
		    System.out.println("Vetor de " + x + " posicoes copiado.");
            long endTime  = System.nanoTime();
            long timeElapsed = endTime - startTime;
                
            System.out.println("Tempo de Execucao em Nanosegundos: " + timeElapsed);
            System.out.println("Tempo de Execucao em Microsegundos: " + timeElapsed / 1000);
            System.out.println("Tempo de Execucao em Milisegundos: " + timeElapsed / 1000 / 1000);
            System.out.println("Tempo de Execucao em Segundos: " + timeElapsed / 1000 / 1000 / 1000);
		}
        
    }

}
