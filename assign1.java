// Jai Shree Ram
//write a program to enter integer num into hrs min and sec
import java.util.*;
class one{

one(){

Scanner sc = new Scanner(System.in);

System.out.println("Jai Hanuman");

System.out.println("Enter values in sec");
int sec = sc.nextInt();

int hr = sec/60;
sec = sec%60;

int min = sec/60;
sec = sec%60;

System.out.println("Value is ");
System.out.println(" HH"+hr+" min"+min+" sec"+sec);

/*
1hrs = 60 min
1min = 60 sec
1hrs = 3600 sec
60MIN = 3600SEC

hrs = sec/60;
sec = sec%60;

min = sec/60;
sec = sec%60;
/ %


*/


}



}

class assign1{

public static void main(String [] argu){

new one();






}


}