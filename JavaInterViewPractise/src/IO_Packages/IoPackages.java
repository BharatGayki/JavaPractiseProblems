package IO_Packages;

import java.io.*;

public class IoPackages {

    public static void main(String[] args) throws IOException {

        FileReader fs = new FileReader("abc.txt");
        BufferedReader bufferedInputStream=new BufferedReader(fs);
        String str =  bufferedInputStream.readLine();

       // System.out.println(str);
        fs.close();


    }
}
