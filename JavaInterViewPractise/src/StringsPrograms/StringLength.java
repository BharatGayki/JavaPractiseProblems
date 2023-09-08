package StringsPrograms;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {


        String name  ;
        Scanner scd = new Scanner(System.in);

        System.out.println("Enter the name");
        name = scd.nextLine();

        System.out.println("Name is "+name);

        System.out.println("Length is "+name.length());

    }
}
