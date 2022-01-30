package assignment;

import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int scoreCounter = 0;
        System.out.println("Enter a score");
        int score = input.nextInt();
        int maximum = 0;
        int minimum = score;



        while (score != -42) {
            total += score;
            scoreCounter++;

            if (score > maximum) {
                maximum = score;
            }

            if (score < minimum) {
                minimum = score;
            }
            System.out.println("Enter a score");
            score = input.nextInt();


        }
        if (score != 0) {
            double average = (double) total / scoreCounter;
            System.out.printf("%nTotal is %d%n",  +total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else
        {
            System.out.println("No score was entered");
        }


            System.out.println("Maximum value is " + maximum);
            System.out.println("Minimum value is " + minimum);
        }
    }



