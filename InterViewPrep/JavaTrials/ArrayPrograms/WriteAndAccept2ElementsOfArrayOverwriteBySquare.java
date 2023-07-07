package ArrayPrograms;

import java.util.Scanner;

public class WriteAndAccept2ElementsOfArrayOverwriteBySquare {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int array1[] = new int[10];

        int array2[] = {1,2,3,4,5,6,7,8,9,10};

        int array3[] = new int[10];

        System.out.println("Enter elements of first array");
        for(int i = 0 ; i < 10 ; i++){

            array1[i] = sc.nextInt();
        }

        for(int j = 0 ; j < 10 ; j++){

            array3[j] = array1[j]*array2[j];

        }
        System.out.println("Square of array is");
        for (int k = 0 ; k < 10 ; k++){

            System.out.println(array3[k]);
        }


    }
}
