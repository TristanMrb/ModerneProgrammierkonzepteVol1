package functional.linearsearch.index;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class FunctionalLinearSearchIndex {
    /**
     * linear search realised by functional programming
     */
    private static FunctionalLinearSearchIndexInterface linearSearch = (intArr, intSearch) -> {
        try {
            return IntStream
                    .range(0, intArr.length)
                    .filter(i -> intArr[i] == intSearch)
                    .findFirst()
                    .getAsInt();
        } catch (NoSuchElementException e) {
            return -1;
        }
    };

    /**
     * starts the functional linear search function
     *
     * @param arr       the array to be searched
     * @param searchInt the int to be found
     * @return returns index of int if found. If the int is not the array, the function returns -1.
     */
    public static int findIndex(int[] arr, int searchInt) {
        return linearSearch.search(arr, searchInt);
    }
}
