public class Ex3_MedeAcoes {
    public static void main(String[] args) {
        long compar = 0;
        long aritOp = 0;
        long atrib  = 0;
		/*10 e 10; 50 e 75; 100 e 300; 500 e 200; 1000 e 1000; 5000 e 7000; 
		10000 e 1; 50000 e 25000; 100000 e 100000; e 500000 e 1000 */
		
        atrib++;
		int N = 50000;
        atrib++;
		int M = 25000;
        atrib++;
		double matriz[][] = new double[N][M];

		for(int i = 0; i < N; i++){
            atrib++; // i =0
            atrib++; // i = i+ 1
            compar++; // x <N
            aritOp++; // i++
		    for(int j = 0; j < matriz[i].length; j ++){
                aritOp++; // j ++
                atrib++; // j =0
                atrib++; // j = j +1
                atrib++; // matriz = -1
                compar++; // j < matriz...
		        matriz[i][j] = -1;
		    }
		}

		System.out.println("Matriz de " + N + " x " + M + " foi limpa.");
        System.out.println("");
        System.out.println("Quantidade de Comparações.........: " + compar); // contas if, for, while
        System.out.println("Quantidade de Operações Aritmética: " + aritOp); // conta operaçẽos
        System.out.println("Quantidade de Atribuições.........: " + atrib); // conta atribuições 
        System.out.println("");
	}
}
