public class Recurssion_Practise {

    public static void openRussianDoll(int doll) {
        if (doll == 1) {
            System.out.println("All dolls are opened");
        } else {
            openRussianDoll(doll - 1);

        }

    }

    public static void main(String[] args) {
 //int a = 5;
        openRussianDoll(5);
    }

}
