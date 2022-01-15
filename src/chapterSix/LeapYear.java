package chapterSix;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int year = 1;
        while (true) {
            System.out.println("Enter the year to check if it is a leap year or 0 to exit: ");
            year = input.nextInt();
            if (year != 0)
                leapYearCalculator(year);
            else System.exit(0);
        }
    }
    public static void leapYearCalculator(int number){
        if((number % 4 == 0 && number %100 != 0 ) || (number % 100 == 0 && number % 400 == 0))
        { System.out.println("It is a leap year");}
        else System.out.println("It is not a leap year");
    }
}
