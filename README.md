# Moderne Programmierkonzepte: Sort & Search
Project by Marcel Mertens, Anton Ochel, Tizian Groß, Tristan Emig & Benno Grimm

## General Idea
* Create a program that sorts a given array using quicksort and then searches for a given element using binary search. 
* Compare that to a program that searches the array in a linear matter.
* Find out for which of those programs is more useful for different search operations.

## Concept
* A UI displays all the test results of the different algorithms
* 4 search algorithms and 2 sort & search algorithms can be compared
  * each of the algorithms returns a minimum time, a maximum time and an average time
* every algorithm is tested
  * the test consist of a 10000 element array where one random specific number has to be found
    * it is repeated 100 times to get the test results
    
## Structure
* Every category has its own package
* Every algorithm is its own class
* Every Algorithm has its own test function that delivers the results back to the UI
* The results are then displayed

## Developement

### What we found out
* Not every search algorithm can be implemented in a functional way
  * For some, it does not even make sense -> recursive algorithms
* Multithreaded programming produces a lot of unecessary overhead

### Problems and fixes
* In an earlier version, the first results were higher than the results after restarting the tests (while the application is still open)
  * This was due to the cache memory and page tables that adjust over time to the running processes
    * This was fixed by running through the test 6 times before showing the first test results -> this results in a longer loading time at first
* In an earlier version, the times did not match the calculated mathematic times
  * After seperating the algorithms and giving them their own test function, the problem was resolved
  
## Explaining the results

### Searching by Index vs. Searching by List
When comparing all the algorithms by their output logic, it is easy to see that in almost all cases, the index search is faster; up to 2 times.
This makes sense when you look at the structure of the algorithm. When you only search for the index, the search process is stopped after the first matched result is found. With the list, every matched result is being extracted from the array, subsequently, the whole array is being run through. This also explains their min and max times being closer together in some cases. Furthermore, the list functions have to manage a seperate list, which slows them down even more.

### Functional vs. Multithreaded vs. Object Oriented
When comparing all the algorithms by their internal logic, the results are unanimous: object oriented is the fastest, functional takes the second place and multithreaded is the lowest by a big margin.
This can be explained. The object oriented functions have direct acceess to the array, which greatly reduces their time to get a number to compare it, while the functional functions have to work with the stream. The multithreaded functions are by far the slowest because their massive overhead and management impairs their performance.

### Linear Search vs. Quick Sort + Binary Search
Now, when we look at our main objective of this project, we can see that the QuickSort + BinarySearch method is performing way better than all the other options. Especially binary search is incredibly fast, outperforming any other search algorithm by at least 2 times. This result, of course, is only representative to the specific parameters applied here. Changing the number of searched numbers and the size of the array will change the results drastically and may give a different algorithm the best performance.

Now, when we look at our main objective of this project, we can see that the linear search is actually more effective. Time it takes to run through the whole array is less than the time it takes to perform a quicksort. As you can see in [Bild]: /bilder/LinearQuicksortBinary "Bild" ![Bild][Bild] , there is a small intervall where quicksort is faster, but it is between 1 & 2, so it is irrelevant for most cases. In the pictures below, you can see the different runtimes of the algorithms and how they stick up to each other.

![Bild](/bilder/geogebra-export%20(1).png "Linear Search vs. QuickSort + BinarySearch") *Linear Search (Blau) vs. QuickSort + BinarySearch (Grün): Großes Array*

![Bild](/bilder/LinearQuicksortBinary.png "Linear Search vs. QuickSort + BinarySearch") *Linear Search (Grün) vs. QuickSort + BinarySearch (Orange): Schnittpunkt*

![Bild](/bilder/LinearQuicksortBinary2.png "Linear Search vs. QuickSort + BinarySearch") *Linear Search (Grün) vs. QuickSort + BinarySearch (Orange)*

![Bild](/bilder/LinearSearch.png "Linear Search Laufzeit") *Linear Search Laufzeit*

![Bild](/bilder/Quicksort.png "Quicksort Laufzeit") *Quicksort Laufzeit*

![Bild](/bilder/BinarySearch.png "Binary Search Laufzeit") *Binary Search Laufzeit*

----
©Multiflex Co.KG
