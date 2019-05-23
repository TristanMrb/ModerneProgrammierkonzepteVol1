package tests;

import oo.binarysearch.OOBinarySearch;
import oo.linearsearch.index.OOLinearSearchIndex;
import oo.quicksort.OOQuickSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JUnitTests {

    int [] arr;
    OOLinearSearchIndex oolinear;
    OOQuickSort ooquicky;
    OOBinarySearch oobinary;


    @Before
    public void setup() {
        arr = {12, 69, 98, 41, 88, 31, 54, 8, 69, 420};

        oolinear = new OOLinearSearchIndex();
        ooquicky = new OOQuickSort();
        oobinary = new OOBinarySearch(arr);
    }

    @Test
    public void OOLinearSearchIndexCheck ()
    {
        Assert.assertEquals( oolinear.findInt(69, 69) , 1);
    }

    @Test
    public void OOQuickSortCheck ()
    {

    }

    @Test
    public void OOBinarySearchCheck ()
    {

    }
}
