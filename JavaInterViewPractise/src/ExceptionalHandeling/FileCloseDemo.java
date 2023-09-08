package ExceptionalHandeling;

import java.io.FileInputStream;

public class FileCloseDemo {


    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("d:/abc.text");
        }
        catch (Exception e){
            System.out.println("File not Found");
        }
        finally {
            if (fis!= null){
                try {
                    fis.close();

                }
                catch (Exception e){

                }
            }
            System.out.println("file close");
        }


    }
}
