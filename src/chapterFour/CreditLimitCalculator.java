package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
      startApplication();
    }
public static void startApplication(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account number");
        String accountNumber = input.nextLine();

        System.out.println("Enter the balance at the beginning of the Month");
        int balance = (int)input.nextDouble();

        System.out.println("Total of all items charged by the customer this Month");
        int charges = input.nextInt();

        System.out.println("total credits applied to the customer's account this Month");
        int credit = input.nextInt();

        System.out.println("Allowed credit limit");
        int limit = input.nextInt();

        int newBalance = (balance + charges - credit);
    System.out.println("Dear "+accountNumber);
        System.out.println("Your new balance is " + newBalance);


        if (newBalance > limit) System.out.println("Credit limit exceeded");
        else startApplication();
    }
}
