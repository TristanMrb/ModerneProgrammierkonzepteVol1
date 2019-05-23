package oo.linearsearch.list;

import java.util.ArrayList;
import java.util.List;

public class OOLinearSearchList {

    /**
     * Searches the given array for elements that can be matched
     * @param arr array to be searched
     * @param search element to be put in list
     * @return list of indexes of matched results
     */
    public static List<Integer> findInt(int[] arr, int search) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == search) {
                list.add(i);
            }
        }
        return list;
    }

}
