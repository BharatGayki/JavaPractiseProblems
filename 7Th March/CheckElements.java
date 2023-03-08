//Jai Shree Krishna

//Write a program to check if an array contains a given element in java

public class CheckElements{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int elementToFind = 3;

        boolean found = checkArrayForElement(arr, elementToFind);

        if (found) {
            System.out.println("Element found in array.");
        } else {
            System.out.println("Element not found in array.");
        }
    }

    public static boolean checkArrayForElement(int[] arr, int elementToFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind) {
                return true;
            }
        }

        return false;
    }
}
