package Threads.PractisePrograms;

//Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.

class Thread1 extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 4; i++) {

            System.out.println("GoodMorning");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
class Thread2 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {

            System.out.println("Welcome");

        }
    }
}
public class Question1 {

    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();

        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();
    }
}
