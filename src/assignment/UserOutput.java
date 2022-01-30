package assignment;



import java.util.Scanner;

public class UserOutput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score = 0;
        int sum = 0;
        int maximum = 0;
        System.out.println("enter score");
        int scoreCounter = input.nextInt();
        int minimum = scoreCounter;

        while (score <= 9) {


            System.out.println("enter score");
            scoreCounter = input.nextInt();

            sum = sum + scoreCounter;
            score = score + 1;


            if (score == 10) {
                break;
            }
            if (scoreCounter > maximum){
                maximum = scoreCounter;
            }

            if (scoreCounter < minimum  ){
                minimum = scoreCounter;
            }

        }

        int average = sum/ 10;
        System.out.printf("the average is %d%n", average);

        System.out.println("Maximum value is "+maximum);
        System.out.println( "Minimum value is "+minimum);



    }
}
