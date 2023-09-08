package StringsPrograms;

public class HowManyTimesLetterAppears {


    //// Except the word and tell how many times letter appears

    public static void main(String[] args) {

        String name = "Bhaarat";
        int count = 0;

        for (int i = 0 ; i < name.length() ; i++){

            if (name == "a"){

                count++;
            }
        }
        System.out.println("count is "+count);
    }
}
