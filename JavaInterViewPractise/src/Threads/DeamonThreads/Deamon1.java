package Threads.DeamonThreads;

public class Deamon1 extends  Thread{

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()){

            System.out.println("Deamon thread");
        }
        else {

            System.out.println("child thread");
        }


    }

    public static void main(String[] args) {

        System.out.println("Main thread");

        Deamon1 de = new Deamon1();
       // de.setDaemon(true);
        de.start();
    }
}
