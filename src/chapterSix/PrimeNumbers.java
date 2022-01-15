package chapterSix;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        calculatePrimeNumber();
    }
    public static void calculatePrimeNumber(){
        Scanner e = new Scanner(System.in);
        System.out.println("\"Enter a Score\"");
        int score = e.nextInt();

        int count = 0;
        for (int num =1; num<=score; num++){
            if (score % num == 0){
                count++;
            }
         }

          if(count != 1 && count <= 2){
             System.out.println("This is a prime number");}
         else System.out.println("Not a prime Number");


    }

}
