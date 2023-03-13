public class Recurssion_Practise4 {

    static int powerOfTwo(int n) {
        if (n==0) {
            return 1;
        } else {
            var power = 2*powerOfTwo(n-1);
            return power;
        }
    }

    public static void main(String[] args) {
        System.out.println(powerOfTwo(2));
    }
}
