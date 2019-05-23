package oo.linearsearch.index;

public class OOLinearSearchIndex {

    /**
     * Searches the given array for the element
     * @param arr array to be searched
     * @param search element to be found
     * @return returns index of element. If the element is not in the array, -1 will be returned
     */
    public int findInt(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == search) {
                return i;
            }
        }
        return -1;
    }
}
