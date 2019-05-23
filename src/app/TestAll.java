package app;

import functional.linearsearch.index.FunctionalLinearSearchIndexTest;
import functional.linearsearch.list.FunctionalLinearSearchListTest;
import multithreaded.linearsearch.index.MultithreadedLinearSearchIndexTest;
import multithreaded.linearsearch.list.MultithreadedLinearSearchListTest;
import multithreaded.quicksort.MultithreadedQuicksortTest;
import oo.binarysearch.OOBinarySearchTest;
import oo.linearsearch.index.OOLinearSearchIndexTest;
import oo.linearsearch.list.OOLinearSearchListTest;
import oo.quicksort.OOQuicksortTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *     Class for running all tests
 */

class TestAll {
    /**
     * Method called by the UI
     * @param mode select length of array
     * @return list with all time information
     */
    public static Long[] testall(int mode)
    {
        Long[] allResults = new Long[33];
        int[] arr;
        int iterations = 0;
        int threads = 10;
        List list = new ArrayList();

        int searchObject = ((int) Math.floor(Math.random() * 100));

        //used for different array sizes
        switch (mode)
        {
            case 1:
                arr = new int[10];
                iterations = 100;
                break;
            case 2:
                arr = new int[100];
                iterations = 100;
                break;
            case 3:
                arr = new int[1000];
                iterations = 10;
                break;
            case 4:
                arr = new int[10000];
                iterations = 2;
                break;
            default:
                arr = new int[10];
                iterations = 100;
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

        //OO Quicksort
        list = OOQuicksortTest.test(arr, iterations);
        allResults[18] = (long)list.get(0);
        allResults[19] = (long)list.get(1);
        allResults[20] = (long)list.get(2);
        list.clear();

        //Multithreaded Quicksort
        list = MultithreadedQuicksortTest.test(arr, iterations, threads);
        allResults[21] = (long)list.get(0);
        allResults[22] = (long)list.get(1);
        allResults[23] = (long)list.get(2);
        list.clear();

        //OO BinarySearch
        int [] larr = new int[arr.length];
        for (int j = 0; j < arr.length - 1; j++) {
            larr[j] = arr[j];
        }
        OOQuicksortTest.test(larr, 1);
        list = OOBinarySearchTest.test(larr, searchObject, iterations);
        allResults[24] = (long)list.get(0);
        allResults[25] = (long)list.get(1);
        allResults[26] = (long)list.get(2);
        list.clear();

        // OO Quicksort + OO BinarySearch
        list = TestQuickBinary.test(arr, searchObject, iterations);
        allResults[27] = (long)list.get(0);
        allResults[28] = (long)list.get(1);
        allResults[29] = (long)list.get(2);
        list.clear();

        // Multithreaded Quicksort + OO BinarySearch
        list = TestMultiQuickBinary.test(arr, searchObject, iterations, threads);
        allResults[30] = (long)list.get(0);
        allResults[31] = (long)list.get(1);
        allResults[32] = (long)list.get(2);
        list.clear();
        return allResults;
    }
}
