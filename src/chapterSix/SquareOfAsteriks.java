package chapterSix;

import java.util.Scanner;

public class SquareOfAsteriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides ");
        int numberOfSides = input.nextInt();

        squareOfAsteriks(numberOfSides);
    }
    public static void squareOfAsteriks(int number){

        for (int i = 0; i < number ; i++){
            for (int j = 0; j < number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
