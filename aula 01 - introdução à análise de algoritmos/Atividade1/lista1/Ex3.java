public class Ex3
{
	public static void main(String[] args) {
		//int N[]  = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
		//int M[]  = {10, 75, 300, 200, 1000, 7000, 1,     25000, 100000, 1000};
		
		/*10 e 10; 50 e 75; 100 e 300; 500 e 200; 1000 e 1000; 5000 e 7000; 
		10000 e 1; 50000 e 25000; 100000 e 100000; e 500000 e 1000 */
		
		int N = 10;
		int M = 10;
		double matriz[][] = new double[N][M];
		        
		for(int i = 0; i < N; i++){
		    for(int j = 0; j < matriz[i].length; j ++){
		        matriz[i][j] = -1;
		    }
		}
		System.out.println("Matriz de " + N + " x " + M + " foi limpa.");
	}
}



/*TA COM PROBLEMA*/ 

