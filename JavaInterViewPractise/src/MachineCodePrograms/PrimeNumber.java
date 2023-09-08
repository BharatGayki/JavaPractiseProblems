package MachineCodePrograms;

import java.util.Scanner;

public class PrimeNumber {

    public static void primeNo(){


        for (int i = 0; i < 100; i++) {

            if (i > 1){

                if (i%2 == 1){

                    System.out.println(i);
                }

            }

        }

        primeNo();

    }
    public static void main(String[] args) {

        System.out.println("2 is a EvenPrime Number");


        primeNo();
    }
}
