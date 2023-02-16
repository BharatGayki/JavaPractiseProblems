// Jai Shree Ram

// Write a Java program that swaps two numbers without using third variable................
import java.util.*;

class asign1_swap{

public static void main(String [] argus){

Scanner sc = new Scanner(System.in);

System.out.println("Enter first num:");
int a = sc.nextInt();

System.out.println("Enter second num:");
int b = sc.nextInt();
// a = 10;b =20
a = a+b; // a = 10+20= 30 ----a = 30 -----

b = a-b;//  b = 30-20 = 10 ---b = 10----

a = a-b;//   a = 30-10 = 20 ---a = 20---

System.out.println("Num after swap is a ="  +a+ "b = " +b);

}



}