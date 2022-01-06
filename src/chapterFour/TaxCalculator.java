package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double taxRate;
        for (int citizen = 1; citizen <= 3 ; citizen++){

            System.out.println("Enter the amount earned per month");
            double amount = input.nextDouble();
            if (amount <= 30_000){


                 taxRate = (0.15 * amount);
                System.out.println("Your tax rate is " + taxRate);

            }

            else if (amount > 30_000) {
                double amount2 = amount - 30000;

                taxRate = ((0.20 * amount2) + (0.15*(amount - amount2)));
                System.out.println("Your tax rate is " + taxRate);
            }
        }

    }
}
