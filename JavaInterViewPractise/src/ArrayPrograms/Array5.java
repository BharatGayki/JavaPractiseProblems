package ArrayPrograms;

import java.util.Scanner;

/// accept elements of array and print odd and even number
public class Array5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int array[] = new int [20];

        System.out.println("Enetr the 20 numbers");
        for(int i=0 ; i< array.length ; i++){

             array[i] = sc.nextInt();

        }

        System.out.println("Even number is");
        for (int i=2 ; i< array.length ; i++){

            if(array[i]%2 == 0){
                System.out.println(array[i]);
            }
        }

        System.out.println("Odd number is");
        for (int i = 0 ; i< array.length ; i++){

            if (array[i]%2 != 0){
                System.out.println(array[i]);
            }
        }
    }
}
