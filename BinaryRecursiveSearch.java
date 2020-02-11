import java.io.*;

public class BinaryRecursiveSearch implements Practice03Search {
    public search(int[] arr, int target) {
        int min = 0;
        int max = arr.length;

        if(min>max) {
            int mid = min + max;
            if (arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                return search(arr, target);
            }
        }

    }

    public static void main(String [] args) {

    }
} 