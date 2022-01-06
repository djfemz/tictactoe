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
}
