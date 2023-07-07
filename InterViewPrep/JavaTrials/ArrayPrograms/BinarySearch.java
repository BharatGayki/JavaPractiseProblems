package ArrayPrograms;

public class BinarySearch {


    public static void main(String[] args) {
        int array[]  =  {1,2,3,4,5,6,7,8,9,10};

        int start = 0 , end = array.length-1 , key = 10;

        while (start <= end){

            int mid = (start+end)/2;

            if (array[mid] == key ){
                System.out.println("Value of index of "+key+" is "+mid);
                break;

            }
            else if (array[mid]<key)
            {
            start = mid+1;

            }
            else if (array[mid]>key)
            {
                end = mid-1;

            }
            else {
                System.out.println("key is not perfect");
            }
        }



    }
}
