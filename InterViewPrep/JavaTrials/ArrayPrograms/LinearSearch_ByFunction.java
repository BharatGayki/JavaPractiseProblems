package ArrayPrograms;

import java.util.Scanner;

public class LinearSearch_ByFunction {

    public static int findArray( int array[] , int key){
        int count =0;
        for (int i = 0 ; i < array.length ; i++){

            if (array[i] == key){
                System.out.println("The number is "+array[i]+"on index "+count);
            }
            else{
                count++;
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int array[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for (int i = 0 ; i < array.length ; i++){

            array[i] = sc.nextInt();

        }
        System.out.println("Enter the number to find");
        int key = sc.nextInt();///

       int arrayprint = findArray(array,key);


         if(arrayprint == -1){
             System.out.println("key is incorrect");
         }
         else {
             System.out.println(arrayprint);
         }

    }
}
