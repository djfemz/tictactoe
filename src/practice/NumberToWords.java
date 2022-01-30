package practice;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner userInputCollector = new Scanner(System.in);
            System.out.print("Enter a number between 0 to 69: ");
            int number = userInputCollector.nextInt();
            if (number >= 0 && number <70) {
                if (number / 10 == 0) {
                    checkSingleDigit(number);
                } else if (number / 10 == 1) {
                    checkDigit10To19(number);
                } else if ((number / 10) > 1 && number % 10 == 0) {
                    checkDigitFrom20(number);
                } else if (((number / 10) > 1) && (number % 10 != 0)) {
                    checkSingleAndDigitFrom20(number);
                }
            }
            else System.out.println("Invalid number");
    }
    private static String [] checkSingleDigit(int number){
        String [] oneDigit = {"zero","one", "two","three", "four","five","six","seven","eight","nine"};
        for (int i = 0; i < oneDigit.length; i++) {
            if (i == number ) {
                System.out.print(oneDigit[i]);
            }
        }
        return oneDigit;
    }

    private static String [] checkDigit10To19(int number){
        String [] twoDigits = {"ten","eleven","twelve", "thirteen","fourteen",
                "fifteen","sixteen","seventeen","eighteen","nineteen"};

        for (int i = 0; i < twoDigits.length; i++) {
            if (i + 10 == number) {
                System.out.print(twoDigits[i]);
            }
        }
        return twoDigits;
    }

    private static String [] checkDigitFrom20(int number){
        String [] digitFrom20 = {"twenty", "thirty", "forty","fifty","sixty"};
        for (int i = 0; i < digitFrom20.length; i++) {
            if (i == (number / 10) - 2) {

                System.out.print(digitFrom20[i]);
            }
        }
        return digitFrom20;
    }

    private static void checkSingleAndDigitFrom20(int number){
        String [] digit = {"twenty","thirty", "forty","fifty","sixty"};
      String [] oneDigit=  {"zero","one", "two","three", "four","five","six","seven","eight","nine"};
        for (int i = 0; i < digit.length; i++) {
            if (i == (number / 10) - 2) {
                for (int j = 0; j < oneDigit.length; j++) {
                  if  ( j == number % 10 ){
                      System.out.println(digit[i] + "-" + oneDigit[j]);
                  }
                }
            }
        }

    }

}
