import java.util.Scanner;

public class Practise_7 {

    int n, arm = 0, rem;

        System.out.print("Enter any number");

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    int c = n;

        while (n > 0) {
        rem = n % 10;
        arm = (rem * rem * rem) + arm;
        n = n / 10;
    }

        if (c == arm) {
        System.out.println("Armstrong number");
    }
        else {

        System.out.println("Not Armstrong number");

    }
}
