import java.util.Scanner;

public class Practise_4 {

    //Write a C program that read 5 numbers and sum of all odd values between them.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;

        for(int i=1;i<6;i++){
            System.out.println("Enter the "+i+"num");
            i = sc.nextInt();

            if (i%2!=0){

              sum = sum+i;
            }

        }
        System.out.println("The sum of entered odd values is "+sum);


    }
}
