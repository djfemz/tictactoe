package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class MultiplicationQuiz {
       private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        multiplicationQuiz();
    }
    private static void multiplicationQuiz() {
        SecureRandom output = new SecureRandom();

        int output1 = 1 + output.nextInt(12);
        int output2 = 1 + output.nextInt(12);
int userAnswer = 0;
        int result = output1 * output2;
        System.out.println(output1 + " times " + output2);
        while (userAnswer != -1) {
            userAnswer = input.nextInt();
            if (userAnswer == result) {
                System.out.println("~~~~~~Congratulations, you are a champion~~~~~~");
                promptUserForMoreQuestions();
            }
            else {
                System.out.println("Oops, that wasn't the correct answer, try again.");
            }
        }

    }
    private static void promptUserForMoreQuestions(){
        System.out.println("press 1 to continue and 2 to end game");
        int response = input.nextInt();
        if (response == 1){
            multiplicationQuiz();
        }
        else System.exit(0);
        }
    }


