package ArrayPrograms;

public class CopyOneElementOfArrayIntoAnother {

    public static void main(String[] args) {

        int array1[] = {1,2,3,4,5,6,7,8,9,10};

        int array2[] = new int[10];

        for (int i = 0 ; i < 10 ; i++){

            array2[i] = array1[i];
        }
        System.out.println("Second array is ");
        for (int j = 0 ; j < 10 ; j++){

            System.out.println(array2[j]);
        }

    }
}
