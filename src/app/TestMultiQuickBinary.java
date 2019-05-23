package app;

import multithreaded.quicksort.QuicksortMultithreaded;
import oo.binarysearch.OOBinarySearch;

import java.util.ArrayList;
import java.util.List;

/**
 *  Test for multithread Quicksort combined with object oriented Binarysearch
 */

public class TestMultiQuickBinary {
    public static List test(int[] arr, int searchObject, int iterations, int threads) {
        long minTime = Long.MAX_VALUE;
        long maxTime = Long.MIN_VALUE;
        long average = 0;

        List results = new ArrayList();

        QuicksortMultithreaded l = new QuicksortMultithreaded();

        for (int i = 0; i < iterations; i++) {
            int [] larr = new int[arr.length];
            for (int j = 0; j < arr.length - 1; j++) {
                larr[j] = arr[j];
            }
            long currentTimeStart = System.nanoTime();
            l.quickSort(larr, threads);
            long currentTimeEnd = System.nanoTime();
            OOBinarySearch binary = new OOBinarySearch(larr);
            long currentTimeStart1 = System.nanoTime();
            binary.searchNumber(searchObject);
            long currentTimeEnd1 = System.nanoTime();

            if((currentTimeEnd - currentTimeStart) + (currentTimeEnd1 - currentTimeStart1)  < minTime) {
                minTime = (currentTimeEnd - currentTimeStart) + (currentTimeEnd1 - currentTimeStart1);
            }
            if((currentTimeEnd - currentTimeStart) + (currentTimeEnd1 - currentTimeStart1) > maxTime) {
                maxTime = (currentTimeEnd - currentTimeStart) + (currentTimeEnd1 - currentTimeStart1);
            }

            average += ((currentTimeEnd - currentTimeStart)/1000 + (currentTimeEnd1 - currentTimeStart1)/1000);
        }

        results.add(minTime / 1000);
        results.add(maxTime / 1000);
        results.add(average / iterations);

        return results;
    }
}
