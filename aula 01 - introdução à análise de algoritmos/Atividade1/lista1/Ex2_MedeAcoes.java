public class Ex2_MedeAcoes {
    public static void main(String[] args) {
        long compar = 0;
        long aritOp = 0;
        long atrib  = 0;

		int N[]  = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
		atrib++;

        atrib++;
		for(int x : N){
            atrib++;
		    int vetor_original[] = new int[x];
            atrib++;
		    int vetor_copia[] = new int[x];

		    for(int i = 0; i < x; i++){
                atrib++;
                compar++;
                atrib++;
                aritOp++;
                vetor_original[i] = 0;
		    }

		    for(int j = 0; j < x; j ++){
                atrib++;
                compar++;
                atrib++;
                aritOp++;
                atrib++;
		        vetor_copia[j] = vetor_original[j];
		    }

		System.out.println("Vetor de " + x + " posicoes copiado.");
        System.out.println("");
        System.out.println("Quantidade de Comparações.........: " + compar); // contas if, for, while
        System.out.println("Quantidade de Operações Aritmética: " + aritOp); // conta operaçẽos
        System.out.println("Quantidade de Atribuições.........: " + atrib); // conta atribuições 
        System.out.println("");
		}
	}
}
