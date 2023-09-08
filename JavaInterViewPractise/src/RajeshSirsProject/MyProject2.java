package RajeshSirsProject;

import java.io.IOException;

public class MyProject2 {


    public static void main(String[] args) throws IOException {

//System.in.read("Bharat".getBytes());
//        System.out.println(read);
//

        int value = 0;

        try {
            value = (int) System.in.read();
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
           // System.exit(1);
        }

        System.out.println("The value is " + value);
        
        
    }
}
