public class Recursion_Practise2 {

    public static int fun(int x){

        if (x==10) {
            //return;

        }
        else {
            System.out.println(x);
            fun(x + 1);
            System.out.println(x);
        }
        return x;
    }


    public static void main(String[] args) {
        fun(5);
    }
}
