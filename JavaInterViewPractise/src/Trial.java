public class Trial {

static  final int name1 = 50;

static String name2 = "Bahrat";

static double num = 1213.133;

    static boolean myMethod(){
        System.out.println("Static method called");

        return true ;
    }

    public static void main(String[] args) {


        int name1 = 155;

        System.out.println(name1);

        System.out.println(Trial.name1);

        System.out.println(Trial.name2);

        System.out.println(num);

        System.out.println(Trial.myMethod());



    }




}
