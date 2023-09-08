package IO_Packages;

import java.io.FileOutputStream;

public class OutPutStreamEg {

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("D://abc.txt");
            fos.write(65);
            fos.close();
            System.out.println("Success");
            /// takes only one letter
        }
       catch (Exception e){

       }


    }
}
