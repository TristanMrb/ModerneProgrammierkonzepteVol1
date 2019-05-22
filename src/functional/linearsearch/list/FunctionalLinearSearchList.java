package functional.linearsearch.list;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalLinearSearchList {
    /**
     * linear search realised by functional programming
     */
    private static FunctionalLinearSearchListInterface linearSearch = (arr, str) -> {
        List<Integer> list = IntStream
                .range(0, arr.length)
                .filter(i -> arr[i] == str)
                .mapToObj(i -> i)
                .collect(Collectors.toList());

        return list;
    };
    /**
     * starts the functional linear search function
     * @param arr the array to be searched
     * @param searchInt the int to be found
     * @return returns a list of all the indexes of the matched numbers
     */
    public static List<Integer> searchint(int [] arr, int searchInt){
        return linearSearch.search(arr, searchInt);
    }
}
