import java.io.*;

public class BinaryIterativeSearch implements Practice03Search {
    
    public int search(int [] arr, int target) {
        int min = 0;
        int max = arr.length-1;
        while(min<=max) {
            int mid = (min+max)/2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target) {
                mid = mid+1;
            } else {
                max = mid-1;
            }
        }
        return - 1;
    }

    public static void main(String [] args) {

        int[] numbers = {5,4,3,2,1};

        BinaryIterativeSearch t = new BinaryIterativeSearch();
        System.out.println("Three is at index: " + t.search(numbers, 3));

    }
}