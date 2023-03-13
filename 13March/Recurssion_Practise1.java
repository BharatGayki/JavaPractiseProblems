public class Recurssion_Practise1 {

    public static void recursive(){

        System.out.println("Jai Bajrangbali");

        recursive();
    }

    public static void main(String[] args) {

        recursive();// code run infinite times
    }
}
