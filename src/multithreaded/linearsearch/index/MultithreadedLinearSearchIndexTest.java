package multithreaded.linearsearch.index;

import java.util.ArrayList;
import java.util.List;

public class MultithreadedLinearSearchIndexTest {
    /**
     * Test method for multithreaded linearsearch algorithm
     * @param arr Array to be searched
     * @param searchObject Element to be found
     * @param iterations number of iterations
     * @param threads Threads to be used
     * @return returns list of min, max and average time the test took.
     */
    public static List test(int[] arr, int searchObject, int iterations, int threads) {
        long minTime = Long.MAX_VALUE;
        long maxTime = Long.MIN_VALUE;
        long average = 0;

        List results = new ArrayList();

        MultithreadedIndexLinearSearch l = new MultithreadedIndexLinearSearch();

        for (int i = 0; i < iterations; i++) {
            long currentTimeStart = System.nanoTime();
            l.search(arr, searchObject, threads);
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
