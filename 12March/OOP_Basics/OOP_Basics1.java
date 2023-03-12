import java.sql.SQLOutput;

public class OOP_Basics1 {



        public static void main(String[] args) {

            Pen p1 = new Pen();//Pen() is a constructor

            p1.setColor("Blue");
            System.out.println(p1.color);

            p1.setTip(4);
            System.out.println(p1.tip);
        }
}

        class Pen{

            String color;
            int tip;

            void setColor(String newColor){
              color =  newColor;
            }

            void setTip(int newTip){
                tip = newTip;
            }
        }



