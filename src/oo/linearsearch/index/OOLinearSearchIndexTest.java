package oo.linearsearch.index;

import java.util.ArrayList;
import java.util.List;

public class OOLinearSearchIndexTest {

    /**
     * Test method for OO linearsearch algorithm
     * @param arr array to be sorted
     * @param searchObject object which is searched for
     * @param iterations iterations
     * @return list of min, max and average time the test took
     */
    public static List test(int[] arr, int searchObject, int iterations) {
        long minTime = Long.MAX_VALUE;
        long maxTime = Long.MIN_VALUE;
        long average = 0;

        List results = new ArrayList();

        OOLinearSearchIndex linear = new OOLinearSearchIndex();

        for (int i = 0; i < iterations; i++) {
            long currentTimeStart = System.nanoTime();
            linear.findInt(arr, searchObject);
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
