package sorts;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        
        Main main = new Main();
        main.printArray(arr);

        main.testQuick(arr);
        main.printArray(arr);

        main.testMerge(arr);
        main.printArray(arr);

        main.testBubble(arr);
        main.printArray(arr);

        main.testInsertion(arr);
        main.printArray(arr);

        main.testSelection(arr);
        main.printArray(arr);

        main.testHeap(arr);
        main.printArray(arr);

    }

    public void testQuick(int[] arr) {
        Sorts sorts = new Sorts();
        sorts.quickSort(arr, 0, arr.length - 1);
    }

    public void testMerge(int[] arr) {
        Sorts sorts = new Sorts();
        sorts.sort(arr, 0, arr.length - 1);
    }

    public void testBubble(int[] arr) {
        Sorts sorts = new Sorts();
        sorts.bubbleSort(arr);
    }

    public void testInsertion(int[] arr) {
        Sorts sorts = new Sorts();
        sorts.insertionSort(arr);
    }

    public void testSelection(int[] arr) {
        Sorts sorts = new Sorts();
        sorts.selectionSort(arr);
    }

    public void testHeap(int[] arr) {
        Sorts sorts = new Sorts();
        sorts.sort(arr);
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}