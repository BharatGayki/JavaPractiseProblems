package Threads;


class Threads1 implements Runnable{


    @Override
    public void run() {
        System.out.println("This is thread one");
    }
}

class Thread2 implements Runnable {


    @Override
    public void run() {
        while (true) {

            System.out.println("This is thread 2");
        }
    }
}
public class Threads_Program1 {

    public static void main(String[] args) {

        Threads1 bullet1 = new Threads1();
        Thread gun1 = new Thread(bullet1);

        Thread2 bullet2 = new Thread2();
        Thread gun2 = new Thread(bullet2);

        gun2.start();
        gun1.start();
        gun2.start();

    }
}
