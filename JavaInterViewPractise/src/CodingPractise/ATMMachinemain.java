package CodingPractise;



import java.util.*;



class ATMMachine {

    float Balance;
    int pin = 5674;

    public void checkpin() {

        System.out.println("Enter your pin");

        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();

        if (enteredpin == pin) {

            
            menu();
        } else {

            System.out.println("Enter a valid pin");

            checkpin();


            //menu();
        }
    }

    public void menu() {

        System.out.println("Enter your choice");
        System.out.println("1.Check Account Balance");
        System.out.println("2.Withdrawl Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {

            checkBalance();
        } else if (opt == 2) {

            withdrawlMoney();
        } else if (opt == 3) {

            depositMoney();
        } else if (opt == 4) {

            return;
        } else {

            System.out.println("Enter your valid choice");
        }
    }

    public void depositMoney() {

        System.out.println("Enter Amount");

        Scanner cs = new Scanner(System.in);
        float amount1 = cs.nextFloat();

        Balance = Balance + amount1;

        System.out.println("Money Deposit Successfully");

        menu();

    }

    public void checkBalance() {

        System.out.println("Balance:" + Balance);

        menu();
    }

    public void withdrawlMoney() {

        System.out.println("Enter Account to Withdrawl");

        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > Balance) {

            System.out.println("Insufficient Balance");
        } else {

            Balance = Balance - amount;

            System.out.println("Money Withdrawl Successful");

            menu();
        }

        // public void depositMoney(){

//            System.out.println("Enter Amount");
//
//            Scanner cs = new Scanner(System.in);
//            float amount1 = cs.nextFloat();
//
//            Balance = Balance + amount1;
//
//            System.out.println("Money Deposit Successfully");
//
//            menu();
        // }

    }

}

    class ATMMachinemain {

        public static void main(String[] args) {

            CodingPractise.ATMMachine obj = new CodingPractise.ATMMachine();

            obj.checkpin();

        }
    }


