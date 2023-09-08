package StringsPrograms;

import java.util.Scanner;

public class AcceptInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.next();

        System.out.println("Enter village");
        String village = sc.next();

        System.out.println("The name is "+name);

        System.out.println("The village is "+village);

        System.out.println("/////////////////////////////////////////////////");

        System.out.printf("The name is %s \n",name);
        System.out.printf("The village is %s \n",village);
        System.out.printf("The name is %s and village is %s ",name,village);

    }
}
