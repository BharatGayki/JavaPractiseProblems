package MachineCodePrograms;

public class ArrayPrograms1 {

//// takea a 4the element make its sqauare and add them
    public static void main(String[] args) {

        int array1[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int array2[] =  new int[16];//take array more than above it will be easily copy

        int square_of_array = 0;
        int sum_of_array = 0;

        for(int i = 0 ; i < array1.length  ; i++){

            if(array1[i]%4 == 0){

                array2[i] = array1[i]*array1[i];

                System.out.println("First array : "+array1[i]);

            }
        }
        System.out.println("second array");

        for(int i = 0 ; i< array2.length ; i++){


            System.out.println("Second Array"+array2[i]);

            sum_of_array = sum_of_array +array2[i];


        }

        System.out.println("sum is "+sum_of_array);

    }
}
