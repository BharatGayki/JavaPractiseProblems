import java.util.Scanner;
public class Recurssion_Practise7 {

    public static void function(int i , int n){

        if(i > n) {/// i==1 thats y return 1
            return;
        }
  System.out.println("Bharat");

        function(i+1,n);


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to print");
        int n = sc.nextInt();

        function(1,n);



    }
}
