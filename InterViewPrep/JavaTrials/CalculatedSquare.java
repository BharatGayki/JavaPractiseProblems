class CalculatedSquare{
    public void Square (int  number1){

       int Square =number1*number1;

       System.out.println("square is "+Square);


    }
    public float Square (float number2){

        float Square = number2 * number2 ;
         return Square;
//        System.out.println("square"+ area1);

    }
    public static void main(String[] args){
        CalculatedSquare area = new CalculatedSquare();

        area.Square (5);

//        System.out.println( area.Square(2.0F));

float square1 =  area.Square(2.0F);
        System.out.println("The square is "+square1);
    }

}