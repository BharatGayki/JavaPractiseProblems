import java.util.Scanner;

public class Practise_3 {

    //Write a C program that reads an integer and check the specified range where it belongs.
    // Print an error message if the number is negative and greater than 80.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num");
        int a = sc.nextInt();

        if(a>80&&a<0){
            System.out.println("Error");
        }else {
            System.out.println("The number is in the range");
        }
    }
}
