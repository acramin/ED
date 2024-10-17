import org.junit.jupiter.api.Test;

import sorts.Sorts;

import static org.junit.jupiter.api.Assertions.*;

public class SortsTest {
    Sorts sorts = new Sorts();

    @Test
    public void testQuickSort() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int[] expected = {1, 5, 7, 8, 9, 10};
        sorts.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSort() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int[] expected = {5, 6, 7, 11, 12, 13};
        sorts.sort(arr, 0, arr.length - 1); // chama a função "sort" para merge sort
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expected = {11, 12, 22, 25, 34, 64, 90};
        sorts.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSort() {
        int[] arr = {64, 25, 12, 22, 11};
        int[] expected = {11, 12, 22, 25, 64};
        sorts.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSort() {
        int[] arr = {12, 11, 13, 5, 6};
        int[] expected = {5, 6, 11, 12, 13};
        sorts.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testHeapSort() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int[] expected = {5, 6, 7, 11, 12, 13};
        sorts.sort(arr); // chama a função "sort" para heap sort
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testQuickSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        sorts.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testMergeSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        sorts.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testBubbleSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        sorts.bubbleSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSelectionSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        sorts.selectionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testInsertionSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        sorts.insertionSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testHeapSortEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        sorts.sort(arr);
        assertArrayEquals(expected, arr);
    }
}
