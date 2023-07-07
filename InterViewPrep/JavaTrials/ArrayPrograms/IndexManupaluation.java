package ArrayPrograms;

public class IndexManupaluation {

    // Take the 4th element, square it, and add them
    public static void main(String[] args) {

        int array1[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int array2[] = new int[16];

        int sum_of_array = 0;

        for (int i = 0; i < array1.length; i++) {

            if ((i) % 4 == 0) { // Check if the index is divisible by 4

                int squaredValue = array1[i] * array1[i]; // Square the element

                array2[i] = squaredValue; // Assign the squared value to the second array

                System.out.println("First array element at index " + i + ": " + array1[i]);
            }
        }

        System.out.println("Second array:");

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Second Array element at index " + i + ": " + array2[i]);
            sum_of_array += array2[i]; // Sum up the values of the second array
        }

        System.out.println("Sum is " + sum_of_array);
    }
}
