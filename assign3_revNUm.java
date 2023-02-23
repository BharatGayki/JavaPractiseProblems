// Jai Shree Ram

// Write a Java program to reverse and print a given number.
import java.util.*;

class assign3_revNUm{

public static void main(String [] argus){

Scanner sc = new Scanner(System.in);


System.out.println("Enter the num");
int a = sc.nextInt();

int b,c,d,sum,temp;

temp = a;

b = a%10;
a = a/10;

c = a%10;
a = a/10;

d = a%10;
a = a/10;

sum = (b*1000)+(c*100)+(d*10)+a;

System.out.println("Original num: "+temp+" Reverse num : "+sum);

}

}