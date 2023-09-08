package ArrayPrograms;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // method 1
                int [] arr = new int[5];

//                 arr = new int[]{1, 2, 3, 4, 5};

                 // method 2
//        int [] arr = {1,2,3,4,5};

        for(int i=0 ; i<arr.length ; i++){

                arr[i] = sc.nextInt();
//                    System.out.println(arr[i]);

                }
        for(int i=0 ; i<arr.length ; i++){


                    System.out.println(arr[i]);

        }


    }
}
