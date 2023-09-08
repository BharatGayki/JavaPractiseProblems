package ArraySearching;

public class BinarySearch {

public static  int binarySearch(int number[], int key){

    int start = 0  , end  = number.length;

    while (start < end){

        int mid = start+end/2;

        if (number[mid] == key){
            return mid;
        }
        if (number[mid] > key){
            end = mid-1;
        }
        if (number[mid] < key){
            start = mid+1;

        }



    }
    return -1;
}
    public static void main(String[] args) {

        int number [] = {2,4,6,8,10,12,14};
        int key = 12;
 
      int mid =  binarySearch(number,key);
        System.out.println("Index is "+mid);
    }
}