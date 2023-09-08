package OOPS_Program;

interface bhaarat{
    static boolean bharatMethod1() {
        System.out.println("interface bharat static method");
        return false;
    }

    boolean bharatMethod();
}

class Surendra implements bhaarat {

    @Override
    public boolean bharatMethod() {
        System.out.println("Surendra Method");
        return false;
    }
}
class Sujata implements bhaarat{

    @Override
    public boolean bharatMethod() {
        System.out.println("Sujata method");
        return false;
    }
}
public class InterfaceImplementation {

    public static void main(String[] args) {
        bhaarat bharatinterface = new bhaarat() {
            @Override
            public boolean bharatMethod() {
                System.out.println("MAin calass bharat inteface");
                return false;
            }
        };

        System.out.println(  bhaarat.bharatMethod1() );

        System.out.println(bharatinterface.bharatMethod());

        Sujata sujata = new Sujata();
        System.out.println(sujata.bharatMethod());

    }

}
