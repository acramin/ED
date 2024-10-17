package Testes;

public class BinarySearch{
    public static int nComparacoes = 0;
    public static int indice;
    public static int[] A = {10, 12, 20, 22, 35, 37, 39, 40, 56, 70, 71, 75};

    public static void main(String[] args) {

        int n = 71; // item a ser pesquisado

        System.out.println(" -----  Busca Sequencial  ----- ");

        seqSearch(n);

        if(indice != -1){
            System.out.println("Valor encontrado na posição: " + indice);
            System.out.println("Total de Comparações: " + nComparacoes);
        } else {
            System.out.println("Valor NÃO encontrado na posição: " + indice);
            System.out.println("Total de Comparações: " + nComparacoes);
        }

        nComparacoes = 0;
        indice = 0;

        System.out.println(" -----  Busca Binária  ----- ");

        binSearch(n,0,A.length-1);

        if(indice != -1){
            System.out.println("Valor encontrado na posição: " + indice);
            System.out.println("Total de Comparações: " + nComparacoes);
        } else {
            System.out.println("Valor NÃO encontrado no array ");
            System.out.println("Total de Comparações: " + nComparacoes);
        }

    }

    private static void binSearch(int item, int begin, int end) {
        int metade = (begin + end)/2;

        if(begin > end){
            indice = -1;
            nComparacoes++;
            return;
        }

        if(A[metade] == item){
            indice = metade;
            nComparacoes++;
            return;
        }

        if(A[metade] < item){
            nComparacoes++;
            binSearch(item, metade+1, end);
        } 
        else{
            nComparacoes++;
            binSearch(item, begin, metade);
        }
    }

    private static void seqSearch(int n) {
        for(int i =0; i < A.length; i++){
            if(A[i] == n){
                nComparacoes++;
                indice = i;
                break;
            } else {
                indice = -1;
            }
            nComparacoes++;
        }
    }
}