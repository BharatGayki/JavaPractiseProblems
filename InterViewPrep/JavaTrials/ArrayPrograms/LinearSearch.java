package ArrayPrograms;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        int number [] = {10,15,4,8,6,97,9,86};
        int count = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find in an array");
        int numberkey = sc.nextInt();

        for (int i = 0 ; i < number.length ; i++){

            if (number[i] == numberkey){
                System.out.println("the number "+number[i]+"is onn index "+count);

            }
            else {
                //System.out.println("Number not found");
                count++;
            }
        }




    }



}
