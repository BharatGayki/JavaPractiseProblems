package Threads;

import java.util.function.DoubleToIntFunction;

class firstthread extends Thread{

    public void run(){
        System.out.println("Thread 1st");
    }
}
class secondthread extends Thread{

    public void run(){
        System.out.println("Thread 2nd");
    }
}
public class Thread_Program2 {

    public static void main(String[] args) {

        firstthread ft = new firstthread();
        secondthread st = new secondthread();

        ft.start();
       st.run();
    }
}
