package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

class ExpertingString{

    public static int stringMethod(){

        int count = 0;

        String strarray[] = {"Bharat","Rahul","Sachin","Vishal","Pavan"};

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the key for finding");
        String key = sc.nextLine();

        for (int i = 0 ; i < strarray.length; i++){

            if (strarray[i] == key){

                System.out.println("The string is : "+strarray[i]+"The index is "+count);
            }
            else {

                count++;
                return -1;

            }
        }
        return 0;
    }

}
public class LinearSearch_ByString {

    public static void main(String[] args) {
//
//        String strarray[] = {"Bharat","Rahul","Sachin","Vishal","Pavan"};
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter the key for finding");
//        String key = sc.nextLine();

        ExpertingString expertingString = new ExpertingString();

        int calculate = expertingString.stringMethod();

        if(calculate == -1){

            System.out.println("Key is not found");
        }
        else {
            System.out.println(expertingString.stringMethod());
        }

    }
}
