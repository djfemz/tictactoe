package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class StudentPerformanceMonitor {
    private static final SecureRandom input = new SecureRandom();
    private static final Scanner check = new Scanner(System.in);
    public static void main(String[] args) {
        mathsQuiz();

    }
    private static void mathsQuiz(){
            int userAnswer = 0;
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < 10 ; i++) {
            int output1 = 1 + input.nextInt(12);
            int output2 = 1 + input.nextInt(12);
            int result = output1 * output2;
            System.out.println(output1 + " times " + output2);
            userAnswer = check.nextInt();
            if (userAnswer == result) count++;
            else count1++;
        }
        if ((count * 10) < 75)
            System.out.println("You got "+ (count1 * 10) + "%, Please ask your teacher for extra help. ");
        else System.out.println("You got "+ (count * 10) +"%, Congratulations, you are ready to go to the next level!");
        promptStudentToContinueQuiz();
    }
    private static void promptStudentToContinueQuiz(){
        System.out.println("press 1 to continue and 2 to end game");
        int response = check.nextInt();
        if (response == 1){
            mathsQuiz();
        }
        else {
            System.out.println("~~~~Thank you for taking the Math Quiz~~~~");
            System.exit(0);
        }
    }
}
