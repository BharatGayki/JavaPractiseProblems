package OOPS_Program;
interface Bharat {
    void bharatMethod();
}
///Multiple Inheritance
class BhaaratInterface implements Bharat {
    @Override
    public void bharatMethod() {
        System.out.println("BhaaratInterface Method");
    }
}

class Surendra1 extends BhaaratInterface {
    @Override
    public void bharatMethod() {
        System.out.println("Surendra Method");
    }
}

class Sujata1 extends Surendra1 {
    @Override
    public void bharatMethod() {
        System.out.println("Sujata Method");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Sujata1 sujataObj = new Sujata1();
        sujataObj.bharatMethod(); // Calling the method from Sujata class
    }
}
