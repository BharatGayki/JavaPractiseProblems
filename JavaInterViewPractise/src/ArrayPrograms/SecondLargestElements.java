package ArrayPrograms;

public class SecondLargestElements {

    public static void main(String[] args) {

        int array[] = {1,22,15,4848,52,663,8,98,89,51,44,57};

        int large = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {


            if (large < array[i]) {

                large = array[i];


                array[i] = 0;



            }


            System.out.println(array[i]);
        }
        System.out.println("1 laregst is"+large);



        int second_large = large*0;






        for (int i = 0; i < array.length; i++) {




            if (second_large < array[i]) {

               second_large = array[i];

            }


            System.out.println(array[i]);
        }
        System.out.println(" 2 large is"+second_large
        );



    }
}
