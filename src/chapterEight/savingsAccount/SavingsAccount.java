package chapterEight.savingsAccount;

public class SavingsAccount {
    private static  double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
    public void calculateMonthlyInterest(){
       savingsBalance+= (savingsBalance * annualInterestRate) / 12;

    }
    public void modifyInterestRate(double annualInterestRate){
       SavingsAccount. annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString() {

        return String.format("$%.2f",savingsBalance);
    }


}
