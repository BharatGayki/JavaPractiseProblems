package ClassWork.ObjectOfArray;

import ClassWork.OutterClass;

public class ScopeOut {

    public static void main(String[] args) {

        OutterClass outterClass = new OutterClass();
        OutterClass.InnerClass oi=outterClass.new InnerClass();
        oi.myMethod();

    }
}
