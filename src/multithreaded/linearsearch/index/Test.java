package multithreaded.linearsearch.index;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public List test(int[] arr, int searchObject, int iterations, int threads) {

        //int[] arr = {24,10,0,93,70,75,1,12,90,70,85,39,90,90,44,84,14,70,16,67,90,85,38,38,16,59,11,97,40,19,66,32,19,64,31,89,25,74,47,97,39,64,49,39,50,45,1,60,47,92,82,72,11,91,96,44,13,10,73,85,92,47,48,73,61,9,42,31,86,9,21,41,81,18,27,61,61,47,55,15,0,38,89,64,92,12,19,73,89,23,59,67,62,31,62,14,61,69,52,82,94,18,10,77,97,1,61,26,41,35,33,61,93,59,19,35,89,84,93,35,25,21,91,56,17,25,16,75,64,13,28,89,31,31,77,75,95,3,6,11,69,40,85,7,31,74,14,2,37,60,1,38,2,12,78,53,27,35,23,25,83,82,41,45,23,89,31,48,83,45,16,93,9,85,79,43,98,58,92,28,11,81,53,54,24,62,70,53,64,83,64,26,59,42,43,72,66,90,25,76,53,11,53,14,68,9,30,45,86,63,91,76,13,92,46,12,75,92,28,71,18,90,79,5,40,65,74,40,73,53,72,61,97,13,24,76,80,21,55,15,32,57,35,78,84,66,47,5,93,98,21,99,41,94,77,48,99,31,89,93,46,22,92,2,52,71,45,59,9,73,44,30,98,90,25,34,42,66,97,38,76,1,52,88,17,86,80,23,60,56,14,19,85,75,80,97,60,25,17,61,80,61,63,35,62,84,56,41,45,23,46,85,10,21,5,52,51,73,81,27,60,48,26,34,1,73,7,71,60,72,49,68,34,48,81,45,41,50,62,35,74,48,12,84,18,70,17,97,93,66,38,50,35,85,55,91,77,32,32,28,7,19,83,44,15,21,21,78,42,32,77,70,52,56,58,50,43,75,79,78,77,92,83,81,26,14,14,18,32,10,52,27,5,78,61,55,66,60,36,17,24,68,33,15,75,32,7,12,45,31,54,76,94,36,64,18,15,87,56,82,30,33,70,87,80,67,9,3,70,42,10,93,6,83,72,80,78,2,69,83,34,64,33,9,79,97,8,24,84,10,50,70,99,36,94,9,64,48,46,0,99,63,85,90,79,9,93,60,20,52,99,42,22,38,99,57,36,84,10,88,96,22,89,6,83,32,49,31,15,89,22,58,97,94,12,80,58,19,12,14,97,47,83,57,97,71,33,18,78,22,46,31,11,99,14,84,14,8,32,8,54,46,77,7,89,52,27,83,52,1,62,62,81,99,43,18,30,83,31,90,96,94,12,16,12,85,74,31,18,43,72,9,34,72,29,39,5,2,52,47,60,40,2,8,78,42,68,3,1,72,59,74,52,3,88,5,69,42,3,90,30,52,33,44,26,57,81,74,44,82,22,59,95,44,66,91,19,39,75,72,52,7,18,9,1,62,27,19,22,29,24,37,54,57,30,22,37,83,60,53,50,54,36,78,26,77,24,57,72,17,88,74,65,53,48,18,26,1,68,42,91,8,79,15,31,78,75,21,49,9,74,58,18,80,34,92,55,30,77,58,77,22,50,93,67,19,50,99,18,12,76,38,8,71,82,93,40,57,48,95,89,84,3,49,27,21,95,2,10,10,75,79,8,0,50,9,51,27,34,21,59,7,4,97,76,94,1,56,24,96,89,0,10,80,4,38,95,64,70,30,67,57,55,82,64,6,85,90,38,12,89,60,46,11,85,6,56,17,62,13,40,33,22,42,15,51,51,80,61,72,25,54,99,84,11,84,79,31,42,4,48,45,87,52,36,68,39,48,75,43,76,38,31,32,96,61,93,19,93,87,87,57,23,63,43,44,86,55,55,66,2,59,6,77,1,73,8,85,22,16,57,71,94,27,28,2,59,27,87,86,39,74,95,86,23,43,1,21,86,38,33,76,76,70,68,15,56,45,63,94,79,64,86,51,89,86,75,43,50,70,82,62,73,28,19,2,9,85,60,47,25,6,72,13,61,47,76,19,2,66,38,36,42,79,88,56,58,44,77,15,20,33,19,34,85,96,86,75,36,17,38,41,91,27,67,43,24,8,35,20,9,64,51,79,37,71,41,93,52,86,75,32,77,45,40,44,34,8,23,78,12,63,56,76,36,70,82,8,8,20,13,73,96,79,72,54,26,98,9,25,30,18,48,81,57,27,51,1,32,16,88,90,94,29,36,71,96,24,15,2,64,64,74,26,72,66,12,16,71,12,0,30,40,52,35,66,18,19,10,16,56,62,26,17,20,4,18,8,32,51,83,81,12,25,27,19,17,30,44,36,21,29,51,78,20,17,86,78,60,28};
        long minTime = Long.MAX_VALUE;
        long maxTime = Long.MIN_VALUE;
        long average = 0;

        List results = new ArrayList();

        //int searchObject = ((int) Math.floor(Math.random() * 100));

        MultithreadedIndexLinearSearch l = new MultithreadedIndexLinearSearch();


        for (int i = 0; i < iterations; i++) {
            long currentTimeStart = System.nanoTime();
            l.search(arr, searchObject, threads);
            long currentTimeEnd = System.nanoTime();
            if(currentTimeEnd - currentTimeStart < minTime) {
                minTime = currentTimeEnd - currentTimeStart;
            }
            if(currentTimeEnd - currentTimeStart > maxTime) {
                maxTime = currentTimeEnd - currentTimeStart;
            }
            average += currentTimeEnd/1000 - currentTimeStart/1000;
        }

        results.add(minTime/1000);
        results.add(maxTime/1000);
        results.add(average/iterations);

        return results;
    }
}
