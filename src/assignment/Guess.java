package assignment;

import java.security.SecureRandom;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        SecureRandom integer = new SecureRandom();
        Scanner input = new Scanner(System.in);

        int number = 1 + integer.nextInt(1000);
        System.out.println(number);

        System.out.println("\"Guess a random integers between 1 and 1000\"");
        int randomNumber = input.nextInt();

        while (randomNumber != number) {
            if (randomNumber > number) {
                System.out.println("Too high. Try again");
            } else
                System.out.println("Too Low. Try again");

            System.out.println("\"Enter next guess\"");
            randomNumber = input.nextInt();

            if (randomNumber == number) {
                System.out.println("Congratulation, You guessed the number! ");

            }
        }
        String prompt = """
                0. Exit
                1. Play again
                """;
        System.out.println(prompt);
        int select = input.nextInt();
        switch (select) {
            case 0 -> System.out.println("Game over");
            case 1 -> {

                    number = 1 + integer.nextInt(1000);
                    System.out.println(number);
                    System.out.println("\"Guess a random integers between 1 and 1000\"");
                    randomNumber = input.nextInt();


                    while (randomNumber != number) {
                        if (randomNumber > number) {
                            System.out.println("Too high. Try again");
                        } else
                            System.out.println("Too Low. Try again");

                        System.out.println("\"Enter next guess\"");
                        randomNumber = input.nextInt();

                        if (randomNumber == number) {
                            System.out.println("Congratulation, You guessed the number! ");

                        }
                    }
                }

                default -> System.out.println("This is an invalid option");

            }
        }
    }

