package ClassWork.NewIntrestCalculation;

import ClassWork.Loan.LoanClass;
import ClassWork.NewLoan.NewLoan;

public class NewIntrestCalculation {


    final public static void IntrestCalculation(LoanClass loanClass){

        System.out.println(loanClass.getAmt()* loanClass.getDuration());
    }

    public NewIntrestCalculation(double amt , int duration) {

        int Intrest = (int) (amt * duration);

        System.out.println(Intrest);

    }


    public static void main(String[] args) {

        NewLoan newLoan = new NewLoan();
        newLoan.setAmt(3200);
        newLoan.setDuration(4);
        NewIntrestCalculation newIntrestCalculation = new NewIntrestCalculation(newLoan.getAmt(),newLoan.getDuration());




    }
}
