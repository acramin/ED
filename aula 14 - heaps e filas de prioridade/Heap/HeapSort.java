import java.util.Arrays;

public class HeapSort{

    public static int tamanho;
    public static void main(String[] args) { // exemplo do slide
        
        int[] lista = {5,6,2,1,9,10,12,0,3,7,14,99,34,77};

        System.out.println("Lista desordenada: " + Arrays.toString(lista));
        heapsort(lista);
        System.out.println("Lista ordenada Max: " + Arrays.toString(lista));

    }

    // Max Heap

    public static void maxHeapify(int[] A, int pai){
        int esq = 2 * pai + 1;
        int dir = 2 * pai + 2;
        int maior = pai;

        if(esq < tamanho && A[esq] > A[maior]){
            maior = esq;
        }

        if(dir < tamanho && A[dir] > A[maior]){
            maior = dir;
        }

        if(maior != pai){
            int aux = A[pai];
            A[pai] = A[maior];
            A[maior] = aux;
            maxHeapify(A, maior);
        }
    }

    public static void buildMaxHeap(int[] A){
        tamanho = A.length - 1;
        for(int pai = tamanho/2; pai >= 0; pai--){
            maxHeapify(A, pai);
        }
    }

    public static void heapsort(int[] A){
        buildMaxHeap(A);

        for(int i = tamanho; i > 0; i--){
            int aux = A[0];
            A[0] = A[i];
            A[i] = aux;
            tamanho--;
            maxHeapify(A, 0);
        }
    }

}