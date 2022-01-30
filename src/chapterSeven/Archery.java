package chapterSeven;

import java.security.SecureRandom;

public class Archery {
    public static void main(String[] args) {
        int [][] array = new int[4][3];
        int[] sums = new int[4];

        SecureRandom point = new SecureRandom();
        System.out.println("\t\t Chance1\t| Chance2 \t| Chance3 \t| Total ");
        System.out.println("\t\t  " + "-".repeat(42));
        int count = 1;
        int indexOfHighest=0;

        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
        System.out.print("player " + count++ + ":   ");
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                int player1 = point.nextInt(10);
                System.out.print(player1 + "\t\t|\t");
                array[i][j] = player1;
                sum += array[i][j];
            }
            sums[i] = sum;
            if (sum > maximum){
                maximum = sum;
                indexOfHighest = i+1;
            }

            System.out.print(sum);
            System.out.println();
        }
        System.out.println();
        System.out.println("The highest point is " + maximum);
        System.out.print("The winner(s): " + getWinners(sums, maximum));
    }


    private static String getWinners(int[] sums, int maximum){
        String winners = "";
        for (int i = 0; i < sums.length; i++) {
            if (maximum == sums[i]){
                winners += String.format("Player %d ", i+1);
            }
        }
        return winners;
    }
}
