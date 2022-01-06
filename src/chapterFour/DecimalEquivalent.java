package chapterFour;

import java.util.Objects;
import java.util.Scanner;

public class DecimalEquivalent {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");

        String number = input.nextLine();
        int decimalEquivalent = 0;

        int z = 0;
   // if (Integer.parseInt(number) == 0 || Integer.parseInt(number) == 1){
        for (int i =number.length(); i> 0; i--) {

            decimalEquivalent += Integer.parseInt(number.charAt(i - 1) + "") * Math.pow(2, z);

            z++;
        }
       System.out.println(decimalEquivalent);
       // }
     // else System.out.println("This is not a binary number");


    }
}
