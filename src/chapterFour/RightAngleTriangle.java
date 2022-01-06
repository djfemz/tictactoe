package chapterFour;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the base of a triangle: ");
        int lengthOfBase = input.nextInt();
        for(int i = 1; i <= lengthOfBase; i++){
            for (int j=1 ; j <= i ; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
