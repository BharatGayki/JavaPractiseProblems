package ArrayList;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i<= 5 ; i++){

            list.add(i);
        }
        System.out.println(list);


        System.out.println(list.get(0));

        list.remove(0);

        System.out.println(list);

        list.set(0,11);

        System.out.println(list);


        System.out.println( list.contains(4));

    }

}
