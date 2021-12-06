package classwork;

import java.util.Scanner;

public class KataDriver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter score");
        int userInput = input.nextInt();

        System.out.println(Kata2.getResultOf(userInput));
    }
}
