package chapterTwo;

import java.util.Scanner;
public class Values{
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Number");
        int firstNumber = input.nextInt();

        System.out.println("Enter second Number");
        int secondNumber = input.nextInt();

        System.out.println("Enter third number");
        int thirdNumber = input.nextInt();

        System.out.println("Enter fourth number");
        int fourthNumber = input.nextInt();

        System.out.println("Enter fifth number");
        int fifthNumber = input.nextInt();

        int count = 0;
        int number = 0;
         int score = 0;
        if (firstNumber > 0 ){
            count ++;
        }
        if (secondNumber > 0){
            count++;
        }
        if (thirdNumber > 0){
            count ++;
        }

        if (fourthNumber > 0){
            count ++;
        }

        if (fifthNumber > 0){
            count ++;
        }
        System.out.printf("%d is positive%n", +count);

        if (firstNumber < 0){
            number ++;
        }
        if (secondNumber < 0){
            number ++;
        }

        if (thirdNumber < 0){
            number ++;
        }


        if (fourthNumber < 0){
            number ++;
        }

        if (fifthNumber < 0){
            number ++;
        }
            System.out.printf("%d is negative%n", +number);


        if (firstNumber == 0 ){
            score ++;
        }
        if (secondNumber == 0){
            score++;
        }
        if (thirdNumber == 0){
            score ++;
        }

        if (fourthNumber == 0){
            score ++;
        }

        if (fifthNumber == 0){
            score ++;
        }
        System.out.printf("%d is zero%n", +score);



    }
}
