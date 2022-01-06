package chapterFive;

import java.util.Scanner;

public class BarChartPrinting2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array =new int[5];
        for(int i = 0;i< array.length; i++){
            System.out.println("Enter a number between 1 and 30");
            array[i] = input.nextInt();
        }
        for(int i = 0; i< array.length; i++){
            for (int j = 0; j < array[i]; j++){
        if (array[i] > 0 && array [i] < 31) {
            System.out.print("* ");
        }
            }

            System.out.println();
        }
    }
}
