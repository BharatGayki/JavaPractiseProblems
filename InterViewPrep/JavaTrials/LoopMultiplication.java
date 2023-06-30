import java.util.Scanner;

public class LoopMultiplication {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num to multiply");
        int num = sc.nextInt();
        int multiply=0;
        for(int i=1 ; i<=10 ; i++){

            multiply = i*num;

            System.out.println(num+" x "+i+" = "+multiply);

        }
    }
}
