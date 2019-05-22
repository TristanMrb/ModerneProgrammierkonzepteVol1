package oo.binarysearch;

public class OOBinarySearch {
    private static int[] numbers;

    public OOBinarySearch(int[] numbersArray){
        numbers = numbersArray;
    }

    public int searchNumber(int searchedNumber){
        return searchNumberRekursiv(searchedNumber, 0,numbers.length-1);
    }

    private int searchNumberRekursiv(int searchedNumber, int fromIndex, int toIndex){
        int middle = ((toIndex- fromIndex)/2) + fromIndex;
        if(fromIndex > toIndex){
            return -1;
        }
        if(numbers[middle]>searchedNumber){
            return searchNumberRekursiv(searchedNumber,fromIndex,middle-1);
        }else if(numbers[middle]<searchedNumber){
            return searchNumberRekursiv(searchedNumber,middle+1,toIndex);
        }else if(numbers[middle]==searchedNumber) {
            //System.out.println( searchedNumber + " " +numbers[middle]);
            return middle;
        }
        else return -2;
    }
}
