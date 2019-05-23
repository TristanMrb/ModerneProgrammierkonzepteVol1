package tests;

        import functional.linearsearch.index.FunctionalLinearSearchIndex;
        import functional.linearsearch.list.FunctionalLinearSearchList;
        import multithreaded.linearsearch.list.LinearSearcherThread;
        import multithreaded.linearsearch.list.MultithreadedListLinearSearch;
        import multithreaded.quicksort.QuicksortMultithreaded;
        import oo.binarysearch.OOBinarySearch;
        import oo.linearsearch.index.OOLinearSearchIndex;
        import oo.linearsearch.list.OOLinearSearchList;
        import oo.quicksort.OOQuickSort;
        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;

        import java.util.Arrays;
        import java.util.Iterator;
        import java.util.List;

public class JUnitTests {

    int [] arr = {12, 69, 98, 41, 88, 31, 54, 8, 69, 420};
    int [] arr1 = {8, 12, 31, 41, 54, 69, 69, 88, 98, 420};
    int [] arr2 = {12, 8, 31, 41, 54, 69, 69, 88, 98, 420};
    MultithreadedListLinearSearch multilinearlist;
    MultithreadedIndexLinearSearch multilinearindex;
    OOLinearSearchIndex oolinearindex;
    OOLinearSearchList oolinearlist;
    OOQuickSort ooquicky;
    OOBinarySearch oobinary;
    QuicksortMultithreaded quicksortMultithreaded;


    @Before
    public void setup() {
        multilinearlist = new MultithreadedListIndexSearch();
        multilinearindex = new MultithreadedIndexLinearSearch();
        oolinearindex = new OOLinearSearchIndex();
        oolinearlist = new OOLinearSearchList();
        ooquicky = new OOQuickSort();
        oobinary = new OOBinarySearch(arr1);
        quicksortMultithreaded = new QuicksortMultithreaded();
    }

    @Test
    public void FunctionalLinearSearchIndexCheck ()
    {
        Assert.assertEquals( FunctionalLinearSearchIndex.findIndex(arr, 69) , 1);
        Assert.assertEquals( FunctionalLinearSearchIndex.findIndex(arr, 6) , -1);
    }

    @Test
    public void FunctionalLinearSearchListCheck ()
    {
        boolean expectedResult = false;
        List<Integer> list = FunctionalLinearSearchList.searchint(arr, 69);
        Iterator i = list.iterator();
        while( i.hasNext() ) {
            if ( (int) i.next() == 1) {
                expectedResult = true;
            }
            if ( (int) i.next() == 8 ) {
                expectedResult = true;
            }
        }
        Assert.assertEquals( expectedResult , true);
    }

    @Test
    public void MultithreadedLinearSearchListCheck ()
    {
        boolean expectedResult = false;
        List<Integer> list = multilinearlist.search(arr, 69,10);
        Iterator i = list.iterator();
        while( i.hasNext() ) {
            if ( (int) i.next() == 0) {
                expectedResult = true;
            }
            if ( (int) i.next() == 8 ) {
                expectedResult = true;
            }
        }
        Assert.assertEquals( expectedResult , false);
    }

    @Test
    public void OOLinearSearchIndexCheck ()
    {
        Assert.assertEquals( oolinearindex.findInt(arr, 69) , 1);
        Assert.assertEquals( oolinearindex.findInt(arr, 6) , -1);
    }

    @Test
    public void OOLinearSearchListCheck ()
    {
        boolean expectedResult = false;
        List<Integer> list = oolinearlist.findInt(arr, 69);
        Iterator i = list.iterator();
        while( i.hasNext() ) {

            if ( (int) i.next() == 1) {
                expectedResult = true;
            }
            if ( (int) i.next() == 8 ) {
                expectedResult = true;
            }
        }
        Assert.assertEquals( expectedResult , true);
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
        
    @Test
    public void MultithreadeLinearSearchIndexCheckTrue ()
    {
        Assert.assertEquals(1, multilinearindex.search(arr, 69, 1));
    }

    @Test
    public void MultithreadeLinearSearchIndexCheckFalse ()
    {
        Assert.assertEquals(-1, multilinearindex.search(arr, 100, 1));
    }

}
