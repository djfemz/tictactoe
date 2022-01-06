package chapterSix;

import java.util.Scanner;

public class RoundingNumbers2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number with decimal you want to round up: ");
        double number = input.nextDouble();
        System.out.println("The actual number is "+ number);
        System.out.println("The rounded number is "+ roundNumber(number));
        System.out.println("Rounded to tenth is "+ roundToTenth(number));
        System.out.println("Rounded to hundredth is "+ roundToHundredth(number));
        System.out.println("Rounded to thousandth is "+ roundToThousandth(number));

    }
    public static double roundNumber(double number){
        double y = Math.floor(number + 0.5);
        return y;
    }
    public static double roundToTenth(double number){
        double y= Math.floor(number + 0.5)/10;
        return y;
    }
    public static double roundToHundredth(double number){
        double y = Math.floor(number + 0.5)/100;
        return y;
    }
    public static double roundToThousandth(double number){
        double y = Math.floor(number + 0.5)/1000;
        return y;
    }
}
