package practice;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
//    public static void main(String[] args) {
//
//        Scanner input= new Scanner(System.in);
//        int MaximumNumber = 0;
//        int minimum = Integer.MAX_VALUE;
//
//        for(int i= 1; i<= 3; i++){
//            System.out.println("Enter a number");
//            int number = input.nextInt();
//            MaximumNumber = Math.max(MaximumNumber, number);
//            if (number < minimum) minimum = number;
//        }
//        System.out.println("Maximum number is " +MaximumNumber);
//        System.out.println("The minimum number is " + minimum);
//    }

    public static int[] minMax(int firstNumber, int secondNumber, int thirdNumber){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        if (firstNumber > max) {
            max = firstNumber;
        }
        if (firstNumber < min){
            min = firstNumber;
        }
        if (secondNumber > max){
            max = firstNumber;
        }
        if (secondNumber < min){
            min = secondNumber;
        }
        if (thirdNumber > max){
            max = thirdNumber;
        }
        if (thirdNumber < min){
            min = thirdNumber;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] result = minMax(5, 7, 9);
        System.out.println(Arrays.toString(result));
    }

}
