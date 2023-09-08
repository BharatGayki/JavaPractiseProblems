class one{

   final void myMethod(){
        System.out.println("My final method");
    }
}

class two extends one{

//    @Override
//    void myMethod(){
//        System.out.println("not final");
//    }
}

public class Trial_FinalKeyword_method {

    two two = new two();

//    two.myMethod(); cannot resolve this method


}
