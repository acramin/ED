public class Ex1_MedeAcoe2 {
    public static void main(String[] args) {
        long compar = 0;
        long aritOp = 0;
        long atrib  = 0;

        /* Início do código a ser medido*/

        atrib++; // N = ...
        int N[] = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};

		for(int x : N){ // x assume os valores de N
            atrib++; // x = N
            atrib++; // vetor
			int vetor[] = new int[x];
			for(int i = 0; i < x; i++){ // roda x vezes
                atrib++; // i = 0
                atrib++; // i = i +1
                atrib++; // vetor = 0
                compar++; // i < x
                aritOp++; // i ++
				vetor[i] = 0;
			}
			System.out.println("Vetor de " + x + " posicoes criado.");
            System.out.println("");
            System.out.println("Quantidade de Comparações.........: " + compar); // contas if, for, while
            System.out.println("Quantidade de Operações Aritmética: " + aritOp); // conta operaçẽos
            System.out.println("Quantidade de Atribuições.........: " + atrib); // conta atribuições 
            System.out.println("");
    
		}

        /*fim do código a ser medido*/
    }
}
