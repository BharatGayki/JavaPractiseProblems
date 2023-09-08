package LoopPrograms;
import java.util.Scanner;

public class Amount {

    public static void main(String[] args) {
        int amount = 0;
        int count = 0;
        int amtsum = 0;

        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter the amount");
            amount = sc.nextInt();

            if (amount > 0) {
                amtsum = amtsum + amount;


                if (amtsum > 10) {
                    System.out.println("Remaining value: " + (amtsum - 10));
                    amtsum = 10;  // Set amtsum to 10 to avoid exceeding the limit
                }
                count++;
            } else {
                System.out.println("Enter an amount more than zero");
            }

        } while (amtsum < 10);

        System.out.println("Number of times the amount was entered: " + count);
        System.out.println("Sum: " + amtsum);
    }
}
