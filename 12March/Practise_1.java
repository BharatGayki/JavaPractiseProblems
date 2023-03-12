import java.util.Scanner;

// Jai Shree Krishna
public class Practise_1 {
    //Write a C program that accepts three integers and find the maximum of three.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the st num");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd num");
        int b = sc.nextInt();

        System.out.println("Enter the 3rd num");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" Is Greater");
        }
        else if(b>a && b>c){
            System.out.println(b+" Is Greater");
        }
        else {
            System.out.println(c+ " Is Greater");
        }

    }
}
