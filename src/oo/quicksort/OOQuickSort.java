package oo.quicksort;

public class OOQuickSort {
    public OOQuickSort() {

    }

    public void quickSort(int[] arr, int left, int right) {
        int divideIndex = divide(arr, left, right);
        if (divideIndex != -1 && left < right) {
            quickSort(arr, left, divideIndex - 1);
            quickSort(arr, divideIndex + 1, right);
        }
    }

    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);

    }

    private int divide(int[] arr, int left, int right) {
        if (right < left) {
            return -1;
        }

        int counter = left - 1;

        for (int i = left; i <= right - 1; i++) {
            if (arr[i] <= arr[right]) {
                counter++;
                swap(arr, counter, i);
            }
        }
        swap(arr, (++counter), right);
        return counter;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public boolean isSortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
