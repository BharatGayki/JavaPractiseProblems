package MachineCodePrograms;

import java.util.Scanner;

public class Square_Of_Numbers {

    public static int sumOfSquares(int squared_no){

        int sum_of_squaredno = 0 , square = 0;
        System.out.println("Squares are");
        for (int i = 0; i <= squared_no ; i++) {

            square = i*i;

            System.out.println("Square of "+i+" is "+square);

            sum_of_squaredno = sum_of_squaredno + square;


        }

        return sum_of_squaredno;


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to print its squares");
        int squared_no = sc.nextInt();

        int equation = squared_no*(squared_no+1)*(2*squared_no+1)/6;

        int final_sum = sumOfSquares(squared_no);

        if (final_sum == equation){

            System.out.println("Final sum is "+final_sum);
        }


    }
}
