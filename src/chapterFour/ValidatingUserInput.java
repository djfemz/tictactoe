package chapterFour;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
 displayOption();
    }
    public static void displayOption(){
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures=0;
        int studentCounter = 1;

        while (passes+failures != 10){
            System.out.println("Enter result (1=pass, 2 = fail) or -1 to exit: ");
            int result = input.nextInt();

            if (result == 1)passes++;
            else if (result == 2) failures++;
//            else if (result == -1) System.exit(-1);
//            else displayOption();

            studentCounter++;

        }
        System.out.printf("passed: %d%n Failed: %d%n ",passes,failures );
        if (passes > 8) System.out.println("Bonus to instructor!");

    }

}
