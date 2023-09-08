package ClassWork.ObjectOfArray;

public class ArrayObject {

    String name;

    int marks;

    public void display(){

        System.out.println(name);

        System.out.println(marks);

    }

    public ArrayObject(){

        System.out.println("Non parameterized constructor");
    }
    public ArrayObject(String name, int marks) {
        this.name = name;
        this.marks = marks;
        System.out.println(name);
        System.out.println(marks);
    }

    public static void main(String[] args) {

        ArrayObject []arrayObjects;

        arrayObjects = new ArrayObject[3];

        arrayObjects[0] = new ArrayObject();
        arrayObjects[1] = new ArrayObject("bharat",89);
        arrayObjects[2] = new ArrayObject("sachin",86);







    }



}
