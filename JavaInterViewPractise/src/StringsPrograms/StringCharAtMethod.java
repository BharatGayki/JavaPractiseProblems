package StringsPrograms;

import java.util.Scanner;

public class StringCharAtMethod {

    public static void stringCharAt(String name){

        for (int i = 0 ; i < name.length() ; i++){

            System.out.print(name.charAt(i)+" ");
        }

    }

    public static void main(String[] args) {


        String name ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");

        name = sc.nextLine();

        //System.out.println("Name is "+name.charAt(0));

//        for (int i = 0 ; i < name.length(); i++){
//
//            System.out.print(name.charAt(i)+" ");
//        }

        stringCharAt(name);
    }
}
