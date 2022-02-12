package chapterEight.savingsAccount;

public class SavingsAccountDriver {
    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount(2000);
        SavingsAccount savingsAccount2 = new SavingsAccount(3000);
        savingsAccount1.modifyInterestRate(0.04);
savingsAccount1.calculateMonthlyInterest();
savingsAccount2.calculateMonthlyInterest();

        System.out.println("The interest rate for saver1 is "+savingsAccount1);
        System.out.println("The interest rate for saver2 is "+savingsAccount2);
    }
}
