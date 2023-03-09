public class PrintCharacterFromStrings {

    public static void main(String[] args) {
        String s= "Bhaarat Gayki@gmail.com";
        int upp=0,lwr=0,dg=0,sp=0,sc=0;

        char c[] = s.toCharArray();

        int length = c.length;

        for (int i=0;i<c.length;i++){
            if(c[i]>='A'&& c[i]<='Z'){
                upp++;
            } else if (c[i]>='a'&& c[i]<='z') {
                lwr++;

            } else if (c[i]>=0 && c[i]<=9) {
                dg++;

            } else if (c[i]==' ') {
                sp++;
            }else {
                sc++;

            }
        }
        System.out.println("Uppercase is"+upp);
        System.out.println("Lowercase is"+lwr);
        System.out.println("Digits are"+dg);
        System.out.println("Spaces in between are"+sp);
        System.out.println("Special Symols are"+sc);
    }
}
