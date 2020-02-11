import java.io.*;

public class SelectionSort implements Practice03Sort {
    public static void main(String [] args) {
        int[] numbers = {7,21,45,67, 3};

        SelectionSort t = new SelectionSort();
        t.sort(numbers);
        for(int i = 0; i < numbers.length - 1; i++) {
            System.out.println("Number: " + numbers[i] + "\n");

        }
    }

    public void sort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            swap(a, i, findmin(a, i));
        }
    }

    public int findmin(int[] a, int start) {
        int min=start;
        for(int i = (start+1); i < a.length; i++) {
            if(a[i] < a[min]) {
                min = i;
            }
        }
        return min;
    }

    public void swap(int[] a, int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

}