public class Ex4_MedeAcoes {
    public static void main(String[] args) {
        long compar = 0;
        long aritOp = 0;
        long atrib  = 0;
        //int N[]  = {10, 50, 100, 500, 1000, 5000, 10000, 50000, 100000, 50000};

        atrib++;// N =
        int N = 1000;
        atrib++; // simetria =
        boolean simetria = true;

        atrib++; // matriz
		int matriz[][] = new int[N][N];

		for(int i = 0; i < N; i++){
            atrib++; // i = 0
            atrib++; // i = i +1
            aritOp++; // i++
            compar++; // i < N
            for(int j = 0; j < N; j ++){
                atrib++; // j = 0
                atrib++; // j =j +1
                aritOp++; // j ++
                compar++; // j < N
                atrib++; // matriz
                matriz[i][j] = 0;
            }
		}
        
        for(int i = 0; i < N; i++){
            atrib++; // i = 0
            atrib++; // i  =  i + 1
            aritOp++; // i++
            compar++; // i < N
            for(int j = 0; j < N; j ++){
                atrib++; // j =0
                atrib++; // j =  j + 1
                aritOp++; // j = j + 1
                compar++; // j < N
                if(matriz[i][j] != matriz[j][i]){
                    compar++; // !=
                    atrib++; // simetria = 
                    simetria = false;
                }
            }
        }
        System.out.println("Simétrica? " + simetria);
        System.out.println("");
        System.out.println("Quantidade de Comparações.........: " + compar); // contas if, for, while
        System.out.println("Quantidade de Operações Aritmética: " + aritOp); // conta operaçẽos
        System.out.println("Quantidade de Atribuições.........: " + atrib); // conta atribuições 
        System.out.println("");
    }
}
