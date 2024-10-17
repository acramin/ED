public class Ex1
{
	public static void main(String[] args) {
		int N[] = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
		
		for(int x : N){
			int vetor[] = new int[x];
			for(int i = 0; i < x; i++){
				vetor[i] = 0;
			}
			System.out.println("Vetor de " + x + " posicoes criado.");
		}
	}
}
