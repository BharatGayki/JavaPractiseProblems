package IO_Packages;

import java.io.FileInputStream;

public class InputStreamEg2 {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("D://InputStream.txt");

            int i = 0;
            while ((i= fis.read())!=-1){
                System.out.print((char)i);
            }

            fis.close();
        }
        catch (Exception e){

        }


    }
}
