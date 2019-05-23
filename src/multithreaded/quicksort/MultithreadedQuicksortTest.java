package multithreaded.quicksort;

import java.util.ArrayList;
import java.util.List;

public class MultithreadedQuicksortTest {
    /**
     * Test method for multithreaded quicksort algorithm
     * @param arr Array to be sorted
     * @param iterations number of iterations
     * @param threads Threads to be used
     * @return returns list of min, max and average time the test took.
     */
    public static List test(int[] arr, int iterations, int threads) {
        long minTime = Long.MAX_VALUE;
        long maxTime = Long.MIN_VALUE;
        long average = 0;

        List results = new ArrayList();

        QuicksortMultithreaded l = new QuicksortMultithreaded();

        for (int i = 0; i < iterations; i++) {
            int [] larr = new int [arr.length];
            for (int j = 0; j < arr.length-1; j++) {
                larr[j] = arr[j];
            }
            long currentTimeStart = System.nanoTime();
            l.quickSort(larr, threads);
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

        return results;

    }
}
