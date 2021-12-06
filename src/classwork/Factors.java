package classwork;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\"Enter a Score\"");
        int score = input.nextInt();

       int count = 0;
       for (int num =1; num<=score; num++){

           if (score % num == 0){
               System.out.print(num+ " ");

               count++;

           }
       }
        System.out.println();
         System.out.printf("the products are %d", count);
    }
}
