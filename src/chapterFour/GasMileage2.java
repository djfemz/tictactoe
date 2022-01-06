package chapterFour;

import java.util.Scanner;

public class GasMileage2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int miles = 0;

        int gallon = 0;

        double totalMilesPerGallon = 0;
        int counter = 1;
        double milesPerGallon ;

        while ((miles != -1) && (gallon!= -1)){


            System.out.println("\"Enter Miles Driven\"");
            miles = input.nextInt();

            System.out.println("\"Enter the gallons used\"");
            gallon = input.nextInt();
            if(miles != -1 && gallon != -1) {
                milesPerGallon = (miles * 1.0 / gallon);
                totalMilesPerGallon += milesPerGallon;
                System.out.printf("Miles per Gallon for trip %d is %.2f%n", counter, milesPerGallon);
                counter++;
            }

       }

        System.out.printf( "The total miles per gallon is %.2f%n " ,totalMilesPerGallon);
    }
}
