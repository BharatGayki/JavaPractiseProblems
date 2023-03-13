import org.w3c.dom.ls.LSOutput;

public class Recurssion_Practise5 {
/// factorial using recurssion
    public static int factorial(int n) {
        if (n<0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {

        int sum = factorial(3);
        System.out.println(sum);
    }



}
