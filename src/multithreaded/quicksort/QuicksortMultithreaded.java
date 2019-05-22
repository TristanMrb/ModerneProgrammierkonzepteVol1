package multithreaded.quicksort;

import java.util.concurrent.atomic.AtomicInteger;

public class QuicksortMultithreaded {
    public static void quickSort(int[] arr, int threads)
    {
        final AtomicInteger lThreadCounter = new AtomicInteger(1);
        Sorter lThread = new Sorter(arr, 0, arr.length-1, lThreadCounter, threads);
        lThread.run();
        try {
            synchronized (lThreadCounter)
            {
                lThreadCounter.wait();
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
