package chapterSeven;

import java.util.Random;

public class DiceRolling {
    public static void main(String[] args) {
        Random e = new Random();
        int[] frequency = {2,3,4,5,6,7,8,9,10,11,12};
        int sum = 0;
        for (int i = 1; i < 36000000 ; i++) {

                int die1 = 1 + e.nextInt(6);
                int die2 = 1 + e.nextInt(6);
                sum = die1 + die2;
                 // frequency[j] = sum;
              //  System.out.print(sum +" ");
            for (int j = 2; j <= frequency.length; j++) {
                if (sum == frequency[j] ){
                    frequency[i] = sum;
                }else {
                    frequency[i] = frequency[j];
                    break;
                }}

        }
//         for ( sum = 2; sum < frequency.length ; sum++ ){
//         }

    }
}
