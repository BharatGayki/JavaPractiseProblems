package ArrayPrograms;

import java.util.Scanner;

// input 5 numbers in array and print
public class Array3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] array = new int[5];

        for(int i = 0 ; i<array.length ; i++){

            array[i] = sc.nextInt();

        }
        for(int j = 0; j<array.length ; j++){

            System.out.println(array[j]);
        }



    }


}
