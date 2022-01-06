package chapterSix;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number with decimal you want to round up: ");
        double number = input.nextDouble();
        System.out.println("The actual number is "+ number);
        System.out.println("The rounded number is "+ roundNumber(number));
    }
    public static double roundNumber(double number){
        double y = Math.floor(number + 0.5);
        return y;
    }
}
