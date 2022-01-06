package chapterSeven;

import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
 int[] array2 = {-1,-1,-1,-1,-1,-1};

 Scanner input = new Scanner(System.in);
 for (int i = 0; i < array2.length; i++) {
     System.out.println("Enter a number between 10 and 100: ");
     int userInput= input.nextInt();
     for (int j = i; j >= 0; j--) {
         if (userInput != array2[j]){
             array2[i] = userInput;
         }else
         {
            array2[i] = -1;
             break;
         }
     }
 }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
