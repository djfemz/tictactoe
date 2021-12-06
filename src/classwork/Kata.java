package classwork;
import java.util.Scanner;

public class Kata {

    public static String getResultOf(int userInput) {
        String grade = " ";
        if (userInput >= 90) grade = "A";

        if ((userInput <= 89) && (userInput >= 80)) grade = "B";

        if ((userInput <= 79) && (userInput >= 70)) grade = "C";

        if ((userInput <= 69) && (userInput >= 60))  grade = "D";
        if (userInput < 60) grade = "F";

        return grade;

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter score");
        int userInput = input.nextInt();
        String result = getResultOf(userInput);
        System.out.println(result);
    }


}
