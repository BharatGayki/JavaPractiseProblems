// Jai Shree Hari

//Move all the negative elements to one side of the array in java


import java.util.Arrays;

public class RemoveNegativeElements {
    public static void main(String[] args) {
        int[] arr = {-1, 5, -3, 2, -7, 8, 0, -2};

        moveNegativeElements(arr);

        System.out.println(Arrays.toString(arr)); // prints [-1, -3, -7, -2, 5, 8, 0, 2]
    }

    public static void moveNegativeElements(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Find the next negative element from the left
            while (left <= right && arr[left] >= 0) {
                left++;
            }

            // Find the next positive element from the right
            while (left <= right && arr[right] < 0) {
                right--;
            }

            // Swap the negative and positive elements
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
