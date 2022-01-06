package chapterFour;

import java.util.Scanner;

public class SpecificSum {
    public static void main(String[] args) {

        System.out.println("Enter a number ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int total =0;
        int integer =1;
        while (total < number1) {
            System.out.println("Enter to check integers");
            integer = input.nextInt();
            total+= integer;
        }
        System.out.println("The total is " +total);
    }

}
