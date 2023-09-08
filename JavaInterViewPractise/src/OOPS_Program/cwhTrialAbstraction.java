package OOPS_Program;


interface PapuKaSala{

    float a = 123.33F;
    void papuKaSala();
}
interface PapuKiSass{

    void sasuuMaa();

}
abstract class PapukePapa{

    abstract void papuKePapaKiMethod();

    void papuKepapaBadeeAcche() {

    }


}

abstract class PapuKiBiwi{


    public abstract void papuKeBiwiKiMethod();
}
class PapuKiMummy{



}

class PapuKaBhai{


}
class Papu extends PapuKiBiwi implements PapuKiSass,PapuKaSala {


    @Override
    public void papuKeBiwiKiMethod() {

    }

    @Override
    public void sasuuMaa() {

    }

    @Override
    public void papuKaSala() {

    }
}

class Bharat1{

}
class Bharat2 extends PapukePapa{


    @Override
    void papuKePapaKiMethod() {


    }
}

class Bharat3 extends Bharat1{

}
public class cwhTrialAbstraction {

    public static void main(String[] args) {

    }
}
