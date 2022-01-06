package chapterFive;

import java.util.Scanner;

public class MinimumInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput = 1;
        int minimum = Integer.MAX_VALUE;
        while (userInput != -1){
            System.out.println("\"Enter a number\"");
             userInput = input.nextInt();
            if (userInput != -1 && userInput < minimum){
                minimum = userInput;
            }

        }
        System.out.println("The minimum value you inputed is: " +minimum);
    }
}
