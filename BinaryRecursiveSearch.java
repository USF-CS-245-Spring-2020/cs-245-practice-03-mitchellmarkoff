import java.io.*;

public class BinaryRecursiveSearch implements Practice03Search {
    public int search(int[] arr, int target) {
        
        return binsearch(arr, target, 0, arr.length-1);

    }

    public int binsearch(int[] arr, int target, int min, int max) {
        
        if(min>max) {
            return -1;
        }

        int mid = (min + max)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                return binsearch(arr, target, mid+1,max);
            } else {
                return binsearch(arr, target, min, mid-1);
            }
        
    }

    public static void main(String [] args) {
        int[] numbers = {5,4,3,2,1};

        BinaryRecursiveSearch t = new BinaryRecursiveSearch();
        System.out.println("Three is at index: " + t.search(numbers, 3));
    }
} 