package chapterSix;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        System.out.println("The length of the hypotenuse of 3 and 4 is "
                +hypotenuseCalculation(3.0,4.0));
       System.out.println("The length of the hypotenuse of 5 and 12 is "
                +hypotenuseCalculation(5.0,12.0));
       System.out.println("The length of the hypotenuse of 8 and 15 is "
                +hypotenuseCalculation(8.0,15.0));
        double a;
do {
    System.out.println();
    System.out.print("\"Now enter the number of sideA or 0 to exit\":  ");
    Scanner input = new Scanner(System.in);
   a = (int) input.nextDouble();
   if (a != 0) {
       System.out.print("\"Enter the number of sideB\":  ");
       double b = (int) input.nextDouble();
       System.out.printf("The length of the hypotenuse of %.1f and %.1f is %.2f\n",
               a, b, hypotenuseCalculation(a, b));
   }
   else System.exit(0);
}
while (a != 0);
    }
    public static double hypotenuseCalculation(double sideA, double sideB){
       double hypotenus= Math.sqrt (Math.pow(sideA, 2) + Math.pow(sideB,2));
       return hypotenus;
    }

    public static class ConversionTest {
        public static void main(String[] args) {
            TemperatureConversion convert = new TemperatureConversion();
            String conversionOption = """
                    Press 1 to convert to Kelvin
                    Press 2 to convert to Celsius
                    Press 3 to exit
                    """;
            System.out.println(conversionOption);
            Scanner input = new Scanner(System.in);
            int select = input.nextInt();
    try {
        switch (select) {
            case 1 -> {
                System.out.println("Enter the number in Celsius to be converted to Kelvin ");
                int number = input.nextInt();
                convert.setKelvin(number);
                System.out.printf("The number is %.2f Kelvin", convert.getKelvin());
            }
            case 2 -> {
                System.out.println("Enter the number in Celsius to be converted to Kelvin ");
                int number = input.nextInt();
                convert.setCelsius(number);
                System.out.printf("The number is %.2f degree celsius ", convert.getCelsius());
            }
            case 3 -> System.exit(0);
        }
    }
    catch (ArithmeticException e){
        System.out.println("Invalid Option " + e);
    }
        }
    }
}
