package Threads.DeamonThreads;

import java.sql.SQLOutput;

class Deadly extends Thread{

    @Override
    public void run() {

        Thread.currentThread().isDaemon();
        System.out.println("Deamoon Thread");
    }
}
public class Deamon2{

    public static void main(String[] args) {

        System.out.println("Main thread");

        Deadly deadly = new Deadly();
        deadly.setDaemon(true);
        System.out.println(deadly.isDaemon());
        deadly.start();
    }

}