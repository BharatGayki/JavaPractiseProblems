public class Call_By_Value {
//// Call By Value

    static int[] swap(int a, int b){

        int temp = a;


        a = b;

        b = temp;



        // returning 2 values;

        int[] ans = new int[2];
        ans[0] =  b;
        ans[1] = a ;
        //        System.out.println(a+" "+b);

        return ans;

    }
    public static void main(String[] args) {

        int a =10;

        int b = 45;

      int [] ans =  swap(a,b);
      System.out.println("b = " + ans[0]);
      System.out.println("a = " + ans[1]);

//        int[] ans = getSumAndSub(100, 50);
//        System.out.println("Sum = " + ans[0]);
//        System.out.println("Sub = " + ans[1]);
//    System.out.println(a+" "+b);

    }
}
