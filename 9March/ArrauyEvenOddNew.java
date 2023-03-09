public class ArrauyEvenOddNew {

    public static void main(String[] args) {
        int c = 0;
        int a1[] = {1,2,3,4,5,6,7,8,9,10};

        int a2[] = new int[a1.length];

        for (int i=0;i< a1.length;i++){
            if (a1[i]%2==0){
                a2[c] = a1[i];
                c++;

            }

        }
        for (int i =0;i<a1.length;i++){

            if (a1[i]%2!=0){

                a2[c] = a1[i];
                c++;
            }
            System.out.println(a2[i]);
        }
    }

}
