package ArrayPrograms;

import java.util.Scanner;

//// print total count of even and odd in the array
public class Array8 {

    public static void main(String[] args) {

        int evencount=0, oddcount =0;
        Scanner sc = new Scanner(System.in);

//        int array[] = new int [50];

        int array[] = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

//        System.out.println("Enter 50 elements of array");
//        for(int i = 1 ; i<50 ; i++){
//
//           array[i] = sc.nextInt();
//
//        }
        System.out.println("Even number is");
        for( int i = 1; i < 50 ; i++){

            if(array[i]%2==0){

                System.out.println(array[i]);
                evencount++;
            }

        }
        System.out.println("Odd number is");
        for( int i = 1; i < 50 ; i++){

            if(array[i]%2!=0){

                System.out.println(array[i]);
                evencount++;
            }

        }

        System.out.println("Number of even number is"+evencount);

        System.out.println("Number of odd number is"+oddcount);
    }
}
