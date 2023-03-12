import java.util.Scanner;

public class Practise_2 {
    //Write a C program to calculate the distance between the two points.

    public static int discali(int x ,int y){

        int sum=0;
        if(x>y){
            sum = x-y;
        }
        if(y>x){
            sum = y-x;
        }
            return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting pt");
        int a = sc.nextInt();

        System.out.println("Enter ending pt");
        int b = sc.nextInt();

        int sum1 = discali(a,b);

        System.out.println("Distance between them is "+sum1);



    }
}
