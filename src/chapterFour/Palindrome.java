package chapterFour;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        palindromeChecker();

    }
    public static void palindromeChecker(){
        Scanner input = new Scanner(System.in);

        System.out.println("\"Enter five digits\"");

        int digit = input.nextInt();
        if (String.valueOf(digit).length()!= 5) {
            System.out.println("Invalid length of digit");
                palindromeChecker();
        }
        else if (String.valueOf(digit).length() == 5) {
            int firstDigit = (digit / 10000);
            System.out.print(firstDigit + "  ");
            int secondDigit = (digit % 10000) / 1000;
            System.out.print(secondDigit + "  ");
            int thirdDigit = (digit % 1000) / 100;
            System.out.print(thirdDigit + "  ");
            int fourthDigit = (digit % 100) / 10;
            System.out.print(fourthDigit + "  ");
            int fifthDigit = (digit % 10);
            System.out.println(fifthDigit + "  ");


            if (firstDigit == fifthDigit && secondDigit == fourthDigit) {

                    System.out.println("This is a palindrome");
            }
            else {
                System.out.println("This is not a palindrome");
            }
        }
    }
}
