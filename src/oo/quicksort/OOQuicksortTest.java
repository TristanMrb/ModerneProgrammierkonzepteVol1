package oo.quicksort;

import java.util.ArrayList;
import java.util.List;

public class OOQuicksortTest {

    /**
     * Test method for quicksort algorithm
     * @param arr array to be sorted
     * @param iterations iterations
     * @return list of min, max and average time the test took
     */
    public static List test(int [] arr, int iterations) {
        long minTime = Long.MAX_VALUE;
        long maxTime = Long.MIN_VALUE;
        long average = 0;

        List results = new ArrayList();

        OOQuickSort quicky = new OOQuickSort();


        for (int i = 0; i < iterations; i++) {
            int [] larr = new int [arr.length];

            //Copies the given array into a local array to prevent reference issues
            for (int j = 0; j < arr.length-1; j++) {
                larr[j] = arr[j];
            }
            long currentTimeStart = System.nanoTime();
            quicky.quickSort(larr);
            long currentTimeEnd = System.nanoTime();
            if(currentTimeEnd - currentTimeStart < minTime) {
                minTime = currentTimeEnd - currentTimeStart;
            }
            if(currentTimeEnd - currentTimeStart > maxTime) {
                maxTime = currentTimeEnd - currentTimeStart;
            }

            average += ((currentTimeEnd - currentTimeStart) / 1000);
        }

        results.add(minTime/1000);
        results.add(maxTime/1000);
        results.add(average/iterations);

        //returns the result
        return results;
    }

}
