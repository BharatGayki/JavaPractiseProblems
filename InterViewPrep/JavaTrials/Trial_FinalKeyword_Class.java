 class A{// if it becomes final then cannot be inherited simple

    void methodA(){
        System.out.println("final method");
    }
}
class B extends A{

    void methodB(){
        System.out.println("normal class B");
    }
}

public class Trial_FinalKeyword_Class {

    public static void main(String[] args) {
        B b = new B();

        b.methodA();
    }



}
