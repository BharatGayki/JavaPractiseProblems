package MachineCodePrograms;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int array[] = {35,87,444,33,23,123,456,879,0};

        Arrays.sort(array);/// directly applying it

        for(int i = 0 ; i< array.length ; i++){

            System.out.println(array[i]);
        }
    }
}
