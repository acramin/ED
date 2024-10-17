public class Ex2
{
	public static void main(String[] args) {
		int N[]  = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
		

		for (int j = 0; j < 10; j++){
		    int vetor_original[] = new int[N[j]];
		    int vetor_copia[] = new int[N[j]];
		    
		    for(int i = 0; i < N[j]; i++){
		        vetor_original[i] = 0;
		    }
		    
		    for(int l = 0; l < N[j]; l ++){
		        vetor_copia[l] = vetor_original[l];
		    }

		    //System.out.println("Vetor de " + N[j] + " posicoes copiado.");
		}
	}
}
