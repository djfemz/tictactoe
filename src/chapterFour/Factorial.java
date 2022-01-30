package chapterFour;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        getFactorialOfANumber();
        calculateExponentialFactorial();
    }

    public static void getFactorialOfANumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get the factorial: ");
        int factorial = (int) input.nextDouble();
        double total= 1;
        if (factorial!= 0){
            for (int i = 1; i <= factorial ; i++){
                total *= i;
            }
        }
        else {
            System.out.println("You inputted an invalid integer");
            getFactorialOfANumber();
        }
        System.out.println(total);

    }
    public static void calculateExponentialFactorial(){


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get the factorial  exponent: ");
        int userInputCollector = (int) input.nextDouble();
        int numerator = 1;
        double result;
        double total2 = 0;
        for (int i = 1; i <=userInputCollector ; i++) {
            double total= 1;

            for (int j = 1; j <= i; j++) {
                total *=j;
            }
            result = numerator/total;
            total2 += result;
        }
        System.out.println(1 + total2);


    }
}
