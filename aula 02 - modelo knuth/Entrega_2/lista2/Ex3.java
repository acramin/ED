public class Ex3
{
	public static void main(String[] args) {
		int[][] N = {
            {10, 10},
            {50, 75},
            {100, 300},
            {500, 200},
            {1000, 1000},
            {5000, 7000},
            {10000, 1},
            {50000, 25000},
            {100000, 100000},
            {500000, 1000}
        };
            
        for (int M = 0; M < 10; M++){
            double matriz[][] = new double[N[M][0]][N[M][1]];

            for (int i = 0; i < N[M][0]; i++){
                for (int k = 0; k < N[M][1]; k++){
                    matriz[i][k] = -1;
                }
            }
        }
	}
}