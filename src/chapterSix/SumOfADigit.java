package chapterSix;

import java.util.Scanner;

public class SumOfADigit {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = input.nextLine();
        calculateSumOfADigit(number);
    }
    private static void calculateSumOfADigit(String number){
        int total= 0;
        for (int i = 0; i < number.length(); i++) {
            total += Character.getNumericValue(number.charAt(i));
        }
            System.out.println("The total of all the numbers are: "+total);
        return;
    }

}
