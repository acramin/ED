public class Ex2
{
	public static void main(String[] args) {
		int N[]  = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
		
		for(int x : N){
		    
		    int vetor_original[] = new int[x];
		    int vetor_copia[] = new int[x];
		    
		    for(int i = 0; i < x; i++){
		        vetor_original[i] = 0;
		    }
		    
		    for(int j = 0; j < x; j ++){
		        vetor_copia[j] = vetor_original[j];
		    }
		    
		    System.out.println("Vetor de " + x + " posicoes copiado.");
		}
	}
}
