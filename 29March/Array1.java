import java.util.*;

public class Array1 {

    public static void main(String[] args) {

        try {
            int ar1[] = {10, 20, 30, 40, 50, 60, 70};

            int large = Integer.MIN_VALUE;

            for (int i = 0; i <ar1.length; i++) {

                if (large < ar1[i]) {

                    large = ar1[i];
                }
            }
            System.out.println("large value is " + large);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
