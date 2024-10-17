public class Selection_Sort {
    
    public static void main(String[] args) {
        /*Criado para testar o selectionSort */

        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Organizado:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void selectionSort(int arr[]) // cabeçalho 
    /*Esse programa foi retirado do site: 
    https://sortvisualizer.com/selectionsort/ */
    {
        int n = arr.length;  // tamanho do array
    
        for (int i = 0; i < n-1; i++) // percorre o array       -> roda (n - 1)        -> O(n)
        {
            int min_idx = i;  // acha o index do menor valor
            for (int j = i+1; j < n; j++)  // percorre subarry   -> roda (n - i -1)    -> O(n)
                if (arr[j] < arr[min_idx]) // compara se o atual é menor que o minimo
                    min_idx = j; // se for, minimo assume valor atual
    
            int temp = arr[min_idx];  // auxiliar = valor minimo
            arr[min_idx] = arr[i]; // valor minimo = atual
            arr[i] = temp;  // atual = auxiliar
        }
    }
}

/*
 * for dentro de for é n²
 * O(n) * O(n) = O(n²)
 */