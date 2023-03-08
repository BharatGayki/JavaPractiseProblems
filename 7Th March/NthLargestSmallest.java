// Jai Shree Krishna

//Find the nth largest and nth smallest number in an array

import java.util.Arrays;

public class NthLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 10, 3, 1, 7, 6, 5, 9};
        int n = 4; // the value of n

        int nthLargest = findNthLargest(arr, n);
        int nthSmallest = findNthSmallest(arr, n);

        System.out.println("The " + n + "th largest number is: " + nthLargest);
        System.out.println("The " + n + "th smallest number is: " + nthSmallest);
    }

    public static int findNthLargest(int[] arr, int n) {
        Arrays.sort(arr); // sort the array in ascending order
        return arr[arr.length - n]; // return the nth largest element
    }

    public static int findNthSmallest(int[] arr, int n) {
        Arrays.sort(arr); // sort the array in ascending order
        return arr[n - 1]; // return the nth smallest element
    }
}
