package Threads.DeamonThreads;

public class Deamon3 extends Thread{

    @Override
    public void run() {
        System.out.println("Deamon thread");
    }

    public static void main(String[] args) {

       // Thread.currentThread().setDaemon(true);
        System.out.println("Main Thread");

        Deamon3 deamon3 = new Deamon3();
        deamon3.setDaemon(true);
        deamon3.start();
    }
}
/*

Sure. The main difference between deamon3.start(); and deamon3.run(); is that deamon3.start();
will create a new thread, while deamon3.run(); will execute the Deamon3 thread as part of the Main Thread.


If you use deamon3.start();, the Main Thread will continue to run even after the Deamon3
 thread has started. However, if you use deamon3.run();,
 the Main Thread will exit as soon as the Deamon3 thread starts.

This is because the daemon thread attribute is only applied to threads that are created using the start()
 method. Threads that are executed using the run() method are not considered to be daemon threads,
  even if they have been set to daemon using the setDaemon() method.

In the code you provided, the Main Thread is not a daemon thread. However, the Deamon3 thread is a daemon thread
because it has been set to daemon using the deamon3.setDaemon(true); method.
This means that the program will exit as soon as the Deamon3 thread has terminated,
even if the Main Thread has not finished executing.

If you want the Main Thread to continue to run even after the Deamon3 thread has terminated,
then you should make the Main Thread a daemon thread by calling Thread.currentThread().setDaemon(true);
before you start the Deamon3 thread.

In short, deamon3.start(); will create a new thread that will run independently of the Main Thread,
 while deamon3.run(); will execute the Deamon3 thread as part of the Main Thread.
  If the Main Thread is not a daemon thread, then the program will exit as soon as the Deamon3 thread has
  terminated, even if the Main Thread has not finished executing.


 */