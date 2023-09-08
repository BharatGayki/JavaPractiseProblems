package IO_Packages;

import java.io.FileInputStream;

public class InputStreamEg1 {


    public static void main(String[] args) {
        //InputStream

        try{
            // reads only single character
            FileInputStream fis = new FileInputStream("D://InputStream.txt");
            int i = fis.read();
            System.out.println((char) i);

            fis.close();

        }
        catch (Exception e){

        }

    }
}
