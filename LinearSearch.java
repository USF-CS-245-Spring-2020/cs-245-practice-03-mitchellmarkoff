import java.io.*;

public class LinearSearch implements Practice03Search {
    public static void main(String [] args) {
        int[] numbers = {5,4,3,2,1};

        LinearSearch t = new LinearSearch();
        System.out.println("Three is at index: " + t.search(numbers, 3));
    }

    public int search(int[] arr, int target) {
        for(int i = 0; i < arr.length-1; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}