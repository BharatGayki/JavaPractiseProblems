package IO_Packages;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutPutStream {




    public static void main(String[] args) {


        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {

            fos = new FileOutputStream("D://IoPackages//MyIoFile.txt");
            bos = new BufferedOutputStream(fos);
            String str = "Bharat is Great";

            bos.write(str.getBytes());


           // bos.flush();
            bos.close();
            fos.close();
            System.out.println("success");

        } catch (Exception e) {

        }
        finally {


        }

    }


}

