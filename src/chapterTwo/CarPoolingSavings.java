package chapterTwo;

import java.util.Scanner;

public class CarPoolingSavings{

    public static void main(String... args){

        Scanner input = new Scanner(System.in);
        System.out.println("\"Enter total miles driven per day\"");
        double totalMiles = input.nextDouble();

        System.out.println("\"Enter Cost per gallon of gasoline\"");
        double gasolineCost = input.nextDouble();

        System.out.println("\"Enter Average miles per gallon\"");
        double milesPerGallon = input.nextDouble();

        System.out.println("\"Enter parking fees per day\"");
        double parkingFees = input.nextDouble();

        System.out.println("\"Tolls per day\"");
        double tolls = input.nextDouble();

        double dailyDrivingCost = ((totalMiles / milesPerGallon) * gasolineCost + parkingFees + tolls);
        System.out.printf("Your dailyDrivingCost is #%.2f", dailyDrivingCost);

    }
}
