package ArrayPrograms;

public class Array_Min_Max_Value {

    public static void main(String[] args) {

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        int array[] = {1,2,5,4,10,14,55,98,62,3};
        for (int i = 0 ; i < array.length ; i++){

            if(largest < array[i]){

                largest = array[i];

            } else if (smallest > array[i]) {

                smallest = array[i];


            }
        }

        System.out.println("smallest is "+smallest);

        System.out.println("larges is "+largest);
    }
}
