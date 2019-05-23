package tests;

import java.lang.reflect.Array;
import multithreaded.linearsearch.index.MultithreadedIndexLinearSearch;
import multithreaded.quicksort.QuicksortMultithreaded;
import oo.binarysearch.OOBinarySearch;
import oo.linearsearch.index.OOLinearSearchIndex;
import oo.quicksort.OOQuickSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class JUnitTests {

    int [] arr = {12, 69, 98, 41, 88, 31, 54, 8, 69, 420};
    int [] arr1 = {8, 12, 31, 41, 54, 69, 69, 88, 98, 420};
    int [] arr2 = {12, 8, 31, 41, 54, 69, 69, 88, 98, 420};
    OOLinearSearchIndex oolinear;
    OOQuickSort ooquicky;
    OOBinarySearch oobinary;
    QuicksortMultithreaded quicksortMultithreaded;


    @Before
    public void setup() {
        oolinear = new OOLinearSearchIndex();
        ooquicky = new OOQuickSort();
        oobinary = new OOBinarySearch(arr1);
        quicksortMultithreaded = new QuicksortMultithreaded();
    }

    @Test
    public void OOLinearSearchIndexCheck ()
    {
        Assert.assertEquals( oolinear.findInt(arr, 69) , 1);
        Assert.assertEquals( oolinear.findInt(arr, 6) , -1);
    }

    @Test
    public void OOQuickSortCheck ()
    {
        int[] larr = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            larr[i] = arr[i];
        }

        ooquicky.quickSort(larr);

        Assert.assertEquals(Arrays.equals(larr, arr1), true);
        Assert.assertEquals(Arrays.equals(larr, arr2), false);
    }

    @Test
    public void OOBinarySearchCheck ()
    {
        Assert.assertEquals(oobinary.searchNumber(69), 5);
        Assert.assertEquals(oobinary.searchNumber(89), -1);
    }
    

    @Test
    public void QuicksortMultithreadedCheck ()
    {
        int[] larr = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            larr[i] = arr[i];
        }

        quicksortMultithreaded.quickSort(larr,4);
        Assert.assertEquals(Arrays.equals(larr, arr1), true);
        Assert.assertEquals(Arrays.equals(larr, arr2), false);
    }

}
