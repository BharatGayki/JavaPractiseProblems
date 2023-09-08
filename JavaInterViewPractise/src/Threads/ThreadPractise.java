package Threads;

class ThreadDemo extends Thread{


//    public ThreadDemo(String name) {
//        super(name);
//    }

    @Override
    public void run() {

      int i = 0;

      while (i < 10){
          System.out.println("Semihul");
      }
    }
}
public class ThreadPractise {

    public static void main(String[] args) {

        ThreadDemo td1 = new ThreadDemo();
        ThreadDemo td2 = new ThreadDemo();
        td2.setName("Semiul");

//        System.out.println("Semi loves  "+td1.getName());

        System.out.println("Semi + Rahul = " +
                ""+td2.getName());
    }
}
