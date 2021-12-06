package chapterTwo;

import java.util.Scanner;
public class Arithmetic2{
    public static void main(String... args){

        Scanner number= new Scanner(System.in);

        System.out.println("Enter first digit");
        double firstDigit= number.nextDouble();

        System.out.println("Enter second digit");
        double secondDigit= number.nextDouble();

        System.out.println("Enter third digit");
        double thirdDigit= number.nextDouble();

        double sum= (firstDigit + secondDigit + thirdDigit);
        System.out.printf("the sum is %.0f%n",  sum);

        double product= (firstDigit * secondDigit * thirdDigit);
        System.out.printf("the product is %.0f%n", product);

        double average= ((firstDigit + secondDigit + thirdDigit)/3);
        System.out.printf("the average is %.0f%n", average);

        if (firstDigit > secondDigit){
            if (firstDigit > thirdDigit)

            {System.out.println("firstDigit is the largest");
            }
        }
        if (firstDigit < secondDigit){
            if (firstDigit < thirdDigit)

            {System.out.println("firstDigit is the smallest");
            }
        }
    }
}