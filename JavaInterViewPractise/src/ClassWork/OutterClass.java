package ClassWork;

public class OutterClass {


    public class InnerClass{

        int marks ;

        public InnerClass(){
            marks=100;
        }

       public static void myMethod(){
            System.out.println("Inner Class method");
        }


    }

    public static void main(String[] args) {
        OutterClass outterClass = new OutterClass();
        OutterClass.InnerClass oi=outterClass.new InnerClass();
        oi.myMethod();
       // InnerClass.myMethod();
    }

}
