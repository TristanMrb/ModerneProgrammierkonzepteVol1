package app;

import functional.linearsearch.index.FunctionalLinearSearchIndexTest;
import functional.linearsearch.list.FunctionalLinearSearchListTest;
import multithreaded.linearsearch.index.MultithreadedLinearSearchIndexTest;
import multithreaded.linearsearch.list.MultithreadedLinearSearchListTest;
import oo.linearsearch.index.OOLinearSearchIndex;
import oo.linearsearch.index.OOLinearSearchIndexTest;
import oo.linearsearch.list.OOLinearSearchListTest;
import oo.quicksort.OOQuicksortTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAll {
    public static Long[] testall(int mode)
    {
        Long[] allResults = new Long[30];
        int[] arr = {};
        int iterations = 100;
        int threads = 10;
        List list = new ArrayList();

        int searchObject = ((int) Math.floor(Math.random() * 100));

        switch (mode)
        {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
        }



        list = FunctionalLinearSearchIndexTest.test(arr, searchObject, iterations);
        allResults[0] = (long)list.get(0);
        allResults[1] = (long)list.get(1);
        allResults[2] = (long)list.get(2);
        list = null;

        list = FunctionalLinearSearchListTest.test(arr, searchObject, iterations);
        allResults[3] = (long)list.get(0);
        allResults[4] = (long)list.get(1);
        allResults[5] = (long)list.get(2);
        list = null;

        list = MultithreadedLinearSearchIndexTest.test(arr, searchObject, iterations, threads);
        allResults[6] = (long)list.get(0);
        allResults[7] = (long)list.get(1);
        allResults[8] = (long)list.get(2);
        list = null;

        list = MultithreadedLinearSearchListTest.test(arr, searchObject, iterations, threads);
        allResults[9] = (long)list.get(0);
        allResults[10] = (long)list.get(1);
        allResults[11] = (long)list.get(2);
        list = null;

        list = OOLinearSearchIndexTest.test(arr, searchObject, iterations);
        allResults[12] = (long)list.get(0);
        allResults[13] = (long)list.get(1);
        allResults[14] = (long)list.get(2);
        list = null;

        list = OOLinearSearchListTest.test(arr, searchObject, iterations);
        allResults[15] = (long)list.get(0);
        allResults[16] = (long)list.get(1);
        allResults[17] = (long)list.get(2);
        list = null;

        long [] iterationresult = new long[iterations];
        int [] copyArr = new int [arr.length];

        for (int i = 0; i<iterations; i++) {
            copyArr = Arrays.copyOf(arr, arr.length);
            list = OOQuicksortTest.test(copyArr, 1);

        }
        list = null;

        return allResults;
    }
}
