package app;

import functional.linearsearch.index.FunctionalLinearSearchIndexTest;
import functional.linearsearch.list.FunctionalLinearSearchListTest;
import multithreaded.linearsearch.index.MultithreadedLinearSearchIndexTest;
import multithreaded.linearsearch.list.MultithreadedLinearSearchListTest;

import java.util.ArrayList;
import java.util.List;

public class TestAll {
    public static long[] testall(int mode)
    {
        long[] allResults = new long[30];
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

        return null;
    }
}
