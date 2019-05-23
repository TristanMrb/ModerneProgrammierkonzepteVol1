package oo.quicksort;

public class OOQuickSort {
    public OOQuickSort() {

    }

    /**
     * Same as {@code quicksort(int[] arr)} just with more arguments
     * @param arr (unsorted) int Array, passed by reference
     * @param left start of section that will be sorted ({@code 0} for entire array)
     * @param right end of section that will be sorted ({@code arr.length - 1} for entire array)
     */
    public void quickSort(int[] arr, int left, int right) {
        int divideIndex = divide(arr, left, right);
        if (divideIndex != -1 && left < right) {
            quickSort(arr, left, divideIndex - 1);
            quickSort(arr, divideIndex + 1, right);
        }
    }

    /**
     * Pass function an (unsorted) int Array and it will be sorted (passed by reference)
     * @param arr (unsorted) int Array
     */
    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);

    }

    /**
     * Iterates through the array and swaps larger elements to the right
     * @param arr int array, passed by reference
     * @param left start of section that needs to be looked at
     * @param right end of section that needs to be looked at
     * @return returns the number of elements swapped (see quick sort algorithms for that)
     */
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

    /**
     * Swaps any two given values of a given array, elements need to be passed by their indexes
     * @param arr Array to swap the elements on
     * @param a index of the first value
     * @param b index of the second value
     */
    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * Takes int  Array and returns true if it's sorted ascended, otherwise returns false
     * @param arr int Array to be checked
     * @return returns true if Array is sorted, otherwise false
     */
    public boolean isSortedAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
