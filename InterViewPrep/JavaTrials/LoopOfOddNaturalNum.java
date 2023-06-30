import java.util.Scanner;

public class LoopOfOddNaturalNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr the number to print odd numbers");
        int number = sc.nextInt();

        int sum = 0;


        for (int i=1; i<=number ; i++){

            if (i%2==1){

                System.out.println(i);

                sum = sum + i;

            }
        }

        System.out.println("The sum of odd number is "+sum);


    }




}
