
public class Copy_one_ClassObject_to_Another {

    int a ;

    String name;

    Copy_one_ClassObject_to_Another(){
        System.out.println("Constructor 1 called");
    }

    public static void main(String[] args) {


       Copy_one_ClassObject_to_Another cc1 = new Copy_one_ClassObject_to_Another();

       cc1.a = 1234;
       cc1.name = "Bharat";

        Copy_one_ClassObject_to_Another cc2 = new Copy_one_ClassObject_to_Another();



    }

}
