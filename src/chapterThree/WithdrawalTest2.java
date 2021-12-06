package chapterThree;

import java.util.Scanner;

public class WithdrawalTest2 {
    public static void main(String[] args) {
        Scanner withdrawalAmount = new Scanner(System.in);

        Withdrawal firstAccount= new Withdrawal ("jacinta", 200);
        Withdrawal secondAccount= new Withdrawal("Jacy", 500);
        displayAccount(firstAccount);
        displayAccount(secondAccount);


        System.out.print("Enter deposit amount for firstAccount: ");
        double depositAmount = withdrawalAmount.nextDouble();
        System.out.printf("%nadding to firstNumber balance%f%n", depositAmount);

        firstAccount.deposit(depositAmount);
        displayAccount(firstAccount);
        System.out.print("Enter deposit amount for secondAccount: ");
       double depositAmount2 = withdrawalAmount.nextDouble();


       System.out.printf("%n adding to secondNumber balance%f%n", depositAmount2);
        secondAccount.deposit(depositAmount2);
        displayAccount(secondAccount);


        System.out.print("Enter withdrawal amount for firstAccount: ");
        double withdrawal = withdrawalAmount.nextDouble();
        firstAccount.withdrawal(withdrawal);
displayAccount(firstAccount);
        System.out.print("Enter withdrawal amount for secondAccount: ");
        double withdrawal2 = withdrawalAmount.nextDouble();

        secondAccount.withdrawal(withdrawal2);
        displayAccount(secondAccount);

    }
    public static void displayAccount (Withdrawal firstAccount) {

        System.out.printf("%s balance: #%.2f%n", firstAccount.getName(), firstAccount.getBalance());
    }
    public static void displayAccount2 (Withdrawal secondAccount){
            System.out.printf("%s balance: #%.2f%n", secondAccount.getName(), secondAccount.getBalance());
        }

}
