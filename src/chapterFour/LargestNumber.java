package chapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int maximumNumber = 0;

        for (int i= 1; i<=10; i++){
            System.out.println("Enter the number of unit sold");
            int unit = input.nextInt();
            maximumNumber = Math.max(maximumNumber,unit);

        }
        System.out.println("The maximum number is " +maximumNumber);
    }
}
