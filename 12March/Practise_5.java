import java.util.Scanner;

public class Practise_5 {

    //Write a C program that reads three floating values and check if it is possible to make a triangle with them.
    // Also calculate the perimeter of the triangle if the said values are valid.



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st num");
        float a = sc.nextFloat();

        System.out.println("Enter 2nd num");
        float b= sc.nextFloat();


        System.out.println("Enter 2nd num");
        float c= sc.nextFloat();

        caltri(a,b,c);


    }
    public static void caltri(float x ,float y , float z){
        if(x==y && x==z && y==z){
            System.out.println("Triangle is equilateral");
        } else if (x==y || x==z || y==z )
        {
            System.out.println("Isoleces triaangle");
        }
       float sum  ;
        sum = x+y+z;

        System.out.println("Perimeter is "+sum);
    }
}
