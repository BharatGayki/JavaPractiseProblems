import java.util.Scanner;

public class ConditionalStatment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();

        System.out.println("Enter 2st number");
        int num2 = sc.nextInt();

        System.out.println("Enter 3rd number");
        int num3 = sc.nextInt();



        if(num1>num2 && num1>num3){

            System.out.println("The grater num is "+num1);
        }


    }

}
