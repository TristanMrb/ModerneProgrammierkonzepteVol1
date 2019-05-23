package tests;

import oo.binarysearch.OOBinarySearch;
import oo.linearsearch.index.OOLinearSearchIndex;
import oo.quicksort.OOQuickSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JUnitTests {

    @Before
    public void setup() {
        int[] arr = {12, 69, 98, 41, 88, 31, 54, 8, 69, 420};
        int searchObject = 69;

        OOLinearSearchIndex oolinear = new OOLinearSearchIndex();
        OOQuickSort ooquicky = new OOQuickSort();
        OOBinarySearch oobinary = new OOBinarySearch(arr);
    }

    @Test
    public void OOLinearSearchIndexCheck ()
    {

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
