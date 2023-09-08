package IO_Packages;

public class InputTypes {

    public static void main(String[] args) {
//
//        System.out.println("simple message");
//        System.err.println("error message is error");

        System.out.println("Enter input");

        try {
         int i=System.in.read();//returns ASCII code of 1st character
            System.out.println(i);//will print the character
            System.out.println((char) i);// convert it into ascii to character code
        }
        catch (Exception e){

        }


    }

}
