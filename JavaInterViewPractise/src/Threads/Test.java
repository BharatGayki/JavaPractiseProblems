package Threads;

public class Test extends Thread {

    @Override
    public void run() {
       // Thread.currentThread().setName("Krishna");
        System.out.println("Thread executes :"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        System.out.println("hello :"+Thread.currentThread().getName());

        Test t1 = new Test();
       t1.setName("Radha");
        t1.start();
        System.out.println(Thread.currentThread().isAlive());


        Test t2 = new Test();
        t2.setName("Krishna");
        t2.start();
        System.out.println(t2.isAlive());
    }
}
