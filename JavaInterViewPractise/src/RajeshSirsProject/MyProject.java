package RajeshSirsProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyProject {


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value");
        String name = reader.readLine();
        System.out.println("Hello, " + name + "!");

        //System.in
    }
}
