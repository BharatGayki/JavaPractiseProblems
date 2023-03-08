// Jai Mata Di

//Sure! Here's an example program in Java that finds duplicates in an array:

import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 1};

        HashSet<Integer> set = findDuplicateElements(arr);

        System.out.println("Duplicate elements are: " + set); // prints "Duplicate elements are: [1, 2]"
    }

    public static HashSet<Integer> findDuplicateElements(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> duplicates = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                duplicates.add(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }

        return duplicates;
    }
}
