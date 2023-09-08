package ClassWork.IntrestCalculatin;

import ClassWork.Loan.LoanClass;

public class IntrestCalculation {
//
//    private int rateofin;
//
//    private int amt;
//
//    private int time;

   final public static void IntrestCalculation(LoanClass loanClass){

       System.out.println(loanClass.getAmt()* loanClass.getDuration());
    }

    public static void main(String[] args) {
        LoanClass loanClass = new LoanClass();
        loanClass.setAmt(3000);
        loanClass.setDuration(5);
        IntrestCalculation intrestCalculation = new IntrestCalculation();

        intrestCalculation.IntrestCalculation(loanClass);


    }

}
