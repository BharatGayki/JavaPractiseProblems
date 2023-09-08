public class Copy_Constuctor2 {
    /// Same classss

int number ;

String name;


Copy_Constuctor2(){

    System.out.println("Constructor 1 is called");
}
    Copy_Constuctor2(Copy_Constuctor2 cc1){

        this.number = cc1.number;
        this.name  = cc1.name;
        System.out.println("constructor 2 called");
    }

    public static void main(String[] args) {

        Copy_Constuctor2 cc1 = new Copy_Constuctor2();

        cc1.name = "Bharat";
        cc1.number = 14569;

        Copy_Constuctor2 cc2 = new Copy_Constuctor2(cc1);

        System.out.println(cc2.name+" "+cc2.number);
    }


}
