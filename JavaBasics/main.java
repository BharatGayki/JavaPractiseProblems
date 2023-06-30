class a {
    public static class b {

        public boolean myMethod2() {
            System.out.println("class b");
            return false;
        }

        public static class c {


            public boolean myMethod3() {

                System.out.println("class c");
                return true;
            }
        }

    }

}
public class main{
    public static void main(String[] args) {
        a ob1 = new a();
      a.b ob2 = new a.b();
      a.b.c ob3 = new a.b.c();

        System.out.println("class a");
        System.out.println(ob2.myMethod2());
        System.out.println((ob3.myMethod3()));

    }

}

