package MachineCodePrograms;

public class CodeWithAlgorithm  {

    public static void main(String[] args) {

        int array1[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int even_elements_array[] = new int[22];
        int odd_elements_array[] = new int[22];
        int sum_of_odd_elements_square = 0;// 24200
        int sum_of_even_elements_cube = 0;
        int addition_of_all_elements = 0;


        for (int i = 0 ; i < array1.length ; i++){

            if (array1[i]%2 == 0){
               // System.out.println(array1[i]);
                even_elements_array[i] = array1[i]*array1[i]*array1[i];
            }
            else {
               // System.out.println(array1[i]);
                odd_elements_array[i] = array1[i]*array1[i];
            }
        }

        System.out.println("Even elements cube and addition");
        for (int i = 0 ; i < even_elements_array.length ; i++ ){
            // System.out.println(even_elements_array[i]);

            sum_of_even_elements_cube = sum_of_even_elements_cube + even_elements_array[i];
        }

        System.out.println("Odd elements cube and addition");
        for (int i = 0 ; i < odd_elements_array.length ; i++ ){

         //   System.out.println(odd_elements_array[i]);

           sum_of_odd_elements_square = sum_of_odd_elements_square + odd_elements_array[i];
        }


              System.out.println("som of even "+sum_of_even_elements_cube);
              System.out.println("sum of odd "+sum_of_odd_elements_square);

              addition_of_all_elements = sum_of_even_elements_cube+sum_of_odd_elements_square;
              System.out.println("Addition of all elements : "+addition_of_all_elements);

              addition_of_all_elements = addition_of_all_elements/2;
             System.out.println("divide by 2 : "+addition_of_all_elements);
    }
}
