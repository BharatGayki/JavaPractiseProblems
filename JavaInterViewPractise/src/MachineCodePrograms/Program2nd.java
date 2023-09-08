package MachineCodePrograms;

class program{

    public static  void myArrayPrograms(){
        int array1[] = {1,2,3,4,5};

        int sum_of_array = 0;

        int greater_value = 0 , smaller_value = 0;

        for(int i = 0 ; i <= array1.length ; i++){

            for(int j = 1 ; j <= array1.length ; i++){

                if (array1[i] > array1[j]){

                    greater_value = array1[i];
                    smaller_value = array1[j];


                }
                else if( array1[j] > array1[i] ){

                    greater_value = array1[j];
                    smaller_value = array1[i];

                }
            }

        }
        for (int i = 0 ; i < array1.length ; i++){

            sum_of_array = sum_of_array + array1[i];

        }


        System.out.println("Greater value"+greater_value);
        System.out.println("Smaller value"+smaller_value);

    }
}
public class Program2nd {

    public static void main(String[] args) {

        program program = new program();

        program.myArrayPrograms();



    }



}
