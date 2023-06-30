public class Returning_Two_Values_In_Method {

    static int[] swap1(int a, int b){

        int temp = a;

         a = b;

        b = temp;



        // returning 2 values;

        int[] ans = new int[2];
        ans[0] =  b;
        ans[1] = a ;


        return ans;

    }
    public static void main(String[] args) {

        int a =10;

        int b = 45;

        int [] ans =  swap1(a,b);
        System.out.println("b = " + ans[0]);
        System.out.println("a = " + ans[1]);



    }
}
