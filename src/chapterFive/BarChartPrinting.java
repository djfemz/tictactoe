package chapterFive;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        for(int i = 0 ; i < 5; i++) {
//            System.out.println("Enter a number between 1 and 30");
//          int  number = input.nextInt();
//            if (number >= 1 && number < 30) {
//                for (int j = 1; j <= number; j++) {
//                    System.out.print("* ");
//                }
//            }
//           // else throw new IllegalArgumentException("Invalid input");
//            else System.out.println("Invalid input");
//                System.out.println();
//        }
                    System.out.println("Enter a number between 1 and 30");
                     int  number1 = input.nextInt();
                     System.out.println("Enter a number between 1 and 30");
                     int  number2 = input.nextInt();
                      System.out.println("Enter a number between 1 and 30");
                     int  number3 = input.nextInt();
                      System.out.println("Enter a number between 1 and 30");
                     int  number4 = input.nextInt();
                      System.out.println("Enter a number between 1 and 30");
                     int  number5 = input.nextInt();
        numbers(number1, number2);
        numbers(number3, number4);
        if (number5 >= 1 && number5 <= 30){
                     for (int i = 0; i < number5 ; i++) System.out.print("* ");}
    }

    private static void numbers(int number3, int number4) {
        if (number3 >= 1 && number3 <= 30){
                     for (int i = 0; i < number3 ; i++) System.out.print("* ");}
        System.out.println();
        if (number4 >= 1 && number4 <= 30){
                     for (int i = 0; i < number4 ; i++) System.out.print("* ");}
        System.out.println();
    }
}

