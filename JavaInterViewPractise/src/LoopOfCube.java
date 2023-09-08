import java.util.Scanner;

public class LoopOfCube {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to print the cube");
        int num = sc.nextInt();

        int cube = 0;

        for(int i=1; i<=num ; i++){

            cube = i*i*i;

            System.out.println("The cube of "+i+" is "+cube);

        }
    }
}
