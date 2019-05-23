package app;

import functional.linearsearch.index.FunctionalLinearSearchIndexTest;
import functional.linearsearch.list.FunctionalLinearSearchListTest;
import multithreaded.linearsearch.index.MultithreadedLinearSearchIndexTest;
import multithreaded.linearsearch.list.MultithreadedLinearSearchListTest;
import multithreaded.quicksort.MultithreadedQuicksortTest;
import oo.binarysearch.OOBinarySearchTest;
import oo.linearsearch.index.OOLinearSearchIndex;
import oo.linearsearch.index.OOLinearSearchIndexTest;
import oo.linearsearch.list.OOLinearSearchListTest;
import oo.quicksort.OOQuicksortTest;
import oo.binarysearch.OOBinarySearch;
import oo.quicksort.OOQuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAll {
    public static Long[] testall(int mode)
    {
        Long[] allResults = new Long[30];
        int[] arr;
        int iterations = 100;
        int threads = 10;
        List list = new ArrayList();

        int searchObject = ((int) Math.floor(Math.random() * 100));

        //used for different array sizes
        switch (mode)
        {
            case 1: arr = new int[10];
                break;
            case 2: arr = new int[100];
                break;
            case 3: arr = new int[1000];
                break;
            case 4: arr = new int[10000];
                break;
            default: arr = new int[10];
        }

        //generates our test array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 100);
        }

        //Functional LinearSearchIndex
        list = FunctionalLinearSearchIndexTest.test(arr, searchObject, iterations);
        allResults[0] = (long)list.get(0);
        allResults[1] = (long)list.get(1);
        allResults[2] = (long)list.get(2);
        list.clear();

        //Functional LinearSearchList
        list = FunctionalLinearSearchListTest.test(arr, searchObject, iterations);
        allResults[3] = (long)list.get(0);
        allResults[4] = (long)list.get(1);
        allResults[5] = (long)list.get(2);
        list.clear();

        //Multithreaded LinearSearchIndex
        list = MultithreadedLinearSearchIndexTest.test(arr, searchObject, iterations, threads);
        allResults[6] = (long)list.get(0);
        allResults[7] = (long)list.get(1);
        allResults[8] = (long)list.get(2);
        list.clear();

        //Multithreaded LinearSearchList
        list = MultithreadedLinearSearchListTest.test(arr, searchObject, iterations, threads);
        allResults[9] = (long)list.get(0);
        allResults[10] = (long)list.get(1);
        allResults[11] = (long)list.get(2);
        list.clear();

        //OO LinearSearchIndex
        list = OOLinearSearchIndexTest.test(arr, searchObject, iterations);
        allResults[12] = (long)list.get(0);
        allResults[13] = (long)list.get(1);
        allResults[14] = (long)list.get(2);
        list.clear();

        //OO LinearSearchList
        list = OOLinearSearchListTest.test(arr, searchObject, iterations);
        allResults[15] = (long)list.get(0);
        allResults[16] = (long)list.get(1);
        allResults[17] = (long)list.get(2);
        list.clear();

        long [] iterationresult = new long[iterations];

        //OO Quicksort
        for (int i = 0; i<iterations; i++) {
            list = OOQuicksortTest.test(arr, 1);
            iterationresult[i] = (long)list.get(0);
        }
        List lHelpList = resultBuilder(iterationresult);
        allResults[18] = (long)lHelpList.get(0);
        allResults[19] = (long)lHelpList.get(1);
        allResults[20] = (long)lHelpList.get(2);
        list.clear();
        lHelpList.clear();

        //Multithreaded Quicksort
        for (int i = 0; i<iterations; i++) {
            list = MultithreadedQuicksortTest.test(arr, 1, threads);
            iterationresult[i] = (long)list.get(0);
        }
        lHelpList = resultBuilder(iterationresult);
        allResults[21] = (long)lHelpList.get(0);
        allResults[22] = (long)lHelpList.get(1);
        allResults[23] = (long)lHelpList.get(2);
        list.clear();
        lHelpList.clear();

        //OO BinarySearch
        list = OOBinarySearchTest.test(arr, searchObject, iterations);
        allResults[24] = (long)list.get(0);
        allResults[25] = (long)list.get(1);
        allResults[26] = (long)list.get(2);
        list.clear();

        // OO Quicksort + OO BinarySearch
        // MUSS NOCh ÜERDACHT WERDEN
/*        allResults[27] = (long)lHelpList.get(0);
        allResults[28] = (long)lHelpList.get(1);
        allResults[29] = (long)lHelpList.get(2);
        list.clear();
        lHelpList.clear();*/

        return allResults;
    }

    public static List resultBuilder (long[] iterationresults) {

        List returnValues = new ArrayList();

        Arrays.sort(iterationresults);

        long total_time = 0;
        for (int i = 0; i < iterationresults.length; i++) {
            total_time += (iterationresults[i]/1000);
        }

        returnValues.add(iterationresults[0]/1000);
        returnValues.add(iterationresults[iterationresults.length-1]/1000);
        returnValues.add(total_time/iterationresults.length);

        return returnValues;
    }
}
