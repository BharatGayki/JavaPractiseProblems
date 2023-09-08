package DriveQuestions;

//
// Positive numbers in an array and in Accending Order
//         Input{-100,96,-33,65,45,-67,99,98,-91}
//         Output{45,65,96,98,99}


import java.util.Arrays;

public class Program1 {

    public static void main(String[] args) {


        int array[] = {-100,96,-33,65,45,-67,99,98,-91};

        int second_largest = Integer.MIN_VALUE;


        Arrays.sort(array);

        for (int i = 0 ; i < array.length ; i++){

            if (array[i] > 0){

                System.out.println(array[i]);
            }

        }
        for (int i = 0 ; i < array.length-1 ; i++){

            if(second_largest<array[i]){

                second_largest = array[i];

            }


        }
        System.out.println("Second largest is : "+second_largest);


    }
}
