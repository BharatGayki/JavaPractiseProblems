package IO_Packages;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutStreamEg2 {


    public static void main(String[] args) {

        try {

            FileOutputStream fos = new FileOutputStream("D://efg.txt");
            String s = "My name is Bharat";
            fos.write(s.getBytes());

            byte[] b = s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("success");

        }
        catch (Exception e){

        }

    }
}
