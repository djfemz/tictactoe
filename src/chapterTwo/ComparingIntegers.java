package chapterTwo;
import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String... args){

        Scanner number= new Scanner(System.in);

        System.out.println("Enter first digit");
        int firstDigit= number.nextInt();

        System.out.println("Enter second digit");
        int secondDigit= number.nextInt();

        if (firstDigit > secondDigit)
            System.out.println("firstDigit is larger");

        if (firstDigit == secondDigit)
            System.out.println("These numbers are equal");

    }
}

