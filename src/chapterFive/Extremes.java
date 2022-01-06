package chapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for(int i= 1 ; i <= 10; i++){
            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number < minimum) {minimum = number;}
            if (number > maximum){maximum = number;}

        }
        System.out.println("The minimum number is " + minimum);
        System.out.println("The maximum number is " + maximum);
        int sum = minimum+ maximum;
        System.out.println("The sum of the minimum and maximum is " + sum);
    }
}
