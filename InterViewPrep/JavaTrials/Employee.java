public class Employee {

    int Empid;

    String name;

    static String company = "Rahul pvtLtd";


    Employee(int Empid , String name){

        this.Empid = Empid;
        this.name = name;
        this.company = company;

    }

    public Employee(Employee emp1) {

         Empid = emp1.Empid;
         name = emp1.name;

    }


    public void display(){

        System.out.println(Empid+" "+name+" "+company);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(121,"rahulSeth");

        Employee emp2 = new Employee(emp1);





        emp1.display();

        emp2.display();
    }
}
