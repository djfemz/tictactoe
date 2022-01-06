package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
double number = 0;
double total= 0;
int counter=0;
        while (number != -1) {
            System.out.println("Enter the item number (between 1 and 4) sold or -1 to exit");
            number = input.nextDouble();
            if (number == 1) {
                number = 239.99;
            }
           else  if (number == 2) {
                number = 129.75;
            }
          else   if (number == 3) {
                number = 99.95;
            }
            else if (number == 4) {
                number = 350.89;
            }
            total += number;
            counter++;

        }
        double earning = 200 + (0.09 * total);
        System.out.println(earning);

    }
}
