package chapterFour;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
            int userNumber1 = (int) input.nextDouble();
        System.out.println("Enter a number");
        int userNumber2 = (int) input.nextDouble();

            if (userNumber1 == userNumber2) System.out.println(0 + "   Numbers are equal");
            else if (userNumber1 > userNumber2) System.out.println(1 + ",  First number is greater");
            else System.out.println(-1 + ",  Second number is greater");

    }
}
