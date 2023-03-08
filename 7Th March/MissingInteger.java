//Radhe Radhe

//Find the missing integer from array in java

public class MissingInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};

        int missingNumber = findMissingNumber(arr);

        System.out.println("The missing number is: " + missingNumber); // prints "The missing number is: 3"
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // the size of the original array
        int sum = n * (n + 1) / 2; // the sum of all numbers from 1 to n

        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i]; // subtract each number in the array from the sum
        }

        return sum; // the remaining sum is the missing number
    }
}
