package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMaximum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> memory = new ArrayList<>();
        int counter= 0;
        int userInput = 0;
        int maximumNumber = Integer.MIN_VALUE;


        do{
            System.out.println("Enter a number");
            userInput = input.nextInt();
            if(userInput!= -1 && userInput % 2 == 0) {
                memory.add(userInput);
                counter++;

                if (userInput > maximumNumber)
                    maximumNumber = userInput;
            }


        }
                while(userInput != -1);
        System.out.println("The even numbers are " + counter);
        System.out.println("Maximum Even Number is " + maximumNumber);
    }
}

