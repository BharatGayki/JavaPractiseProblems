package Threads.PractisePrograms;

//Question 3: Demonstrate gerPriority() and setPriority() methods in Java threads.

class Thread4 extends Thread{

    @Override
    public void run() {

        Thread.currentThread().setPriority(MIN_PRIORITY);
        System.out.println("Max priority");
    }
}
class Thread5 extends Thread{


    @Override
    public void run() {
        Thread.currentThread().setPriority(NORM_PRIORITY);

        System.out.println("Norm priority");
    }
}
class Thread6 extends Thread{

    @Override
    public void run() {
        Thread.currentThread().setPriority(MAX_PRIORITY);

        System.out.println("Min Priority");
    }
}
public class Question3 {
    public static void main(String[] args) {

        Thread4 thread4 = new Thread4();
        Thread5 thread5 = new Thread5();
        Thread6 thread6 = new Thread6();

        thread4.start();
        thread5.start();
        thread6.start();

        System.out.println("Min priority :"+thread4.getPriority());
        System.out.println("Norm priority :"+thread5.getPriority());
        System.out.println("Max priority :"+thread6.getPriority());
    }
}
