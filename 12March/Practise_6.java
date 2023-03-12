import java.util.Scanner;

public class Practise_6 {

    //Write a C program that read 5 numbers and counts the number of
    // positive numbers and print the average of all positive values.

    public static void main(String[] args) {
int sum = 0, avg =0;
int i;
        Scanner sc = new Scanner(System.in);

       for( i=1;i<6;i++){

           System.out.println("Enetr the "+i+" num");
           i = sc.nextInt();

           if(i>0){
              sum = sum+i;



           }else{

               System.out.println(i+" Is a negative num");
           }
       }
        avg = sum/i;
       System.out.println("The avg is "+avg);
    }


}
