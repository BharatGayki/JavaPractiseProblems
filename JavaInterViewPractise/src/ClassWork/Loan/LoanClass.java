package ClassWork.Loan;

public class LoanClass {
    private String AccNo;

    private  double amt;

    private  int duration;

    public LoanClass(String accNo, double amt, int duration) {
        AccNo = accNo;
        this.amt = amt;
        this.duration = duration;
    }

    public LoanClass() {

    }

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String accNo) {
        AccNo = accNo;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
