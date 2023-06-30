import java.util.Scanner;

class Calculate_Service {

    public static void getCalculatedvalue(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation to perform");
        String c = sc.nextLine();

        int operation = 5;

        String operationString = " ";

        switch (operation) {
            case 1:
                operationString = "+";
                int d = a + b;
                System.out.println("Addition is " + d);
                break;
            case 2:
                operationString = "-";
                int e = a - b;
                System.out.println("Subtraction is " + e);
                break;
            case 3:
                operationString = "/";
                int f = a / b;
                System.out.println("Division is " + f);
                break;
            case 4:
                operationString = "*";
                int g = a * b;
                System.out.println("Multiplication is " + g);
                break;
            case 5:
                operationString = "%";
                int h = a % b;
                System.out.println("Modulus is " + h);
                break;
            default:
                System.out.println("Invalid operation");
                break;

        }
    }

}

public class Calculated_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        Calculate_Service.getCalculatedvalue(a, b);
    }
}
