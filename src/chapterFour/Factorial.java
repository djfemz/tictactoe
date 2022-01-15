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
        System.out.println("Enter a number to get the factorial the factorial exponent: ");
        int factorial = (int) input.nextDouble();
        double result =0;
        double total= 0;
        double total2 = 1;
         for (int i = 0; i <= factorial; i++ ){
             if (i == 0){
                total = total + 1;
                continue;
             }
             int j = i;
             while (j > 0){
                 total2 = total2 * j;
                 j--;
             }

             result = result + (1/total2);
         }
        System.out.println(result);
    }
}
