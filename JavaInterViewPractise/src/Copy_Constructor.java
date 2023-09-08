class Copy{

    String name ;

    int num ;

Copy(){
    System.out.println("Copy constructor 1");
}
Copy(Copy cc1){

    this.name = cc1.name;

    this.num = cc1.num;
}

}
// Copy_Constuctor2
public class Copy_Constructor {

    public static void main(String[] args) {

        Copy cc1 = new Copy();
        cc1.name = "Bharat";
        cc1.num = 1234;

        Copy cc2 = new Copy(cc1);

        System.out.println(cc2.name+" "+cc2.num);

    }
}
