package practice;

import java.util.Scanner;

public class GetNumber {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("\"Enter a number\"");
        int number = input.nextInt();

        int count = 0;
        for (int num=1; num<=number; num++ ){
          if (number % num==0) {

              System.out.print(num + " ");
              count++;
          }

        }
        System.out.println();
        System.out.printf("The products are %d", count);
    }
}
