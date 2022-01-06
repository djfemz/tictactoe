package chapterFour;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        //collect number
        //set number as largest
        //collect number
        //if number is greater than largest, number is largest
            //else if number is greater than second largest, number is second largest
        //repeat step 3
        int userInput = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int largestNumber = scanner.nextInt();
        int secondLargestNumber = Integer.MIN_VALUE;
        int count = 0;
    while(count < 4) {
        System.out.println("Enter a number");
        userInput = scanner.nextInt();
        if (userInput > largestNumber) {
            secondLargestNumber = largestNumber;
            largestNumber = userInput;
        } else if (userInput > secondLargestNumber) {
            if(count == 2){
                secondLargestNumber = userInput;
            }
            secondLargestNumber = userInput;
        }
        count++;
    }
        System.out.println("Largest number is "+ largestNumber );
        System.out.println("Second  Largest number is "+ secondLargestNumber );

    }
}
