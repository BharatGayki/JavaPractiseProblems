package OOPS_Program;

abstract class HumanBeing{

    String colour ;

    abstract void humansare();

    HumanBeing(){

        System.out.println("This is abstract constructor");
    }
}

class Man extends HumanBeing{

    @Override
    void humansare() {
        System.out.println("This is a man");
    }
}
class Women extends HumanBeing{

    String  changeColour( String color){
        this.colour = color;
        return color;
    }
    @Override
    void humansare() {
        System.out.println("This is women");
    }
}
class Nonbinary extends HumanBeing{

    @Override
    void humansare() {
        System.out.println("This is other category");
    }
}
public class AbstractionTrial2 {

    public static void main(String[] args) {

        Women women = new Women();

        women.humansare();


        System.out.println( women.changeColour("green"));



    }
}
