package Threads.PractisePrograms;
//Question 2: Add a step method in the welcome thread of question 1 to delay its execution for 200ms.

class Thread3 extends Thread{

    @Override
    public void run() {

        for (int i = 1; i <= 4; i++) {

            System.out.println("Questio No :"+i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Question2 {

    public static void main(String[] args) {

        Thread3 thread3 = new Thread3();

        thread3.start();
    }
}
