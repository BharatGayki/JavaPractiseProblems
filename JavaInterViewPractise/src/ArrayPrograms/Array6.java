package ArrayPrograms;

import java.util.Scanner;

//// sum of all odd and even number
public class Array6 {

    public static void main(String[] args) {

        int sum1 =0;
        int sum2 = 0;
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

                sum1 = sum1 + array[i];
            }
        }

        System.out.println("Odd number is");
        for (int i = 0 ; i< array.length ; i++){

            if (array[i]%2 != 0){
                System.out.println(array[i]);

                sum2 = sum2 + array[i];
            }
        }

        System.out.println("Addition of even number is"+sum1);

        System.out.println("Addition of odd number is"+sum2);
    }
}
