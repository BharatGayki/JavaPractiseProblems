package MachineCodePrograms;

import java.util.Scanner;
class Ly{

    public static int leapYear(int leap_year){

        int last_digit = 0 , second_lastdigit = 0 , sum = 0;


        last_digit = leap_year%10;
        leap_year = leap_year/10;

        second_lastdigit = leap_year%10;
        leap_year = leap_year/10;

        sum = (second_lastdigit*10)+last_digit;

        if (sum%4 == 0){

            return 1;
        }
        else {

            return 0;
        }


    }
}
public class LeapYear {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter leap year");
        int leap_year = sc.nextInt();

        Ly ly = new Ly();

       int calculated_Leapyear = Ly.leapYear(leap_year);

        if(calculated_Leapyear == 1){

            System.out.println(leap_year+" Is a leap year");
        }
        else {

            System.out.println(leap_year+" Is not a leap year");
        }

    }
}
