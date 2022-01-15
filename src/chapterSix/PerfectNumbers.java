package chapterSix;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a perfect number: ");
        int check = input.nextInt();
        isPerfect(check);
        System.out.println();
        System.out.print("The perfect numbers between 1 and 1000 are ");
        checkPerfectNumbers();
    }
    public static void isPerfect(int number){
        int prime = 0;
        int total = 0;
        for(int i = 1; i < number; i++){

            if (number % i == 0){
                prime = i;
                total +=i;

            }
        }
            if(total == number){
                System.out.println("This is a perfect number");
            }
            else System.out.println("Not a perfect number");
    }
    public static void checkPerfectNumbers(){
        int total= 0;
        for (int i = 1; i <= 1000; i++) {
            total = 0;
            for (int j = 1; j <i ; j++) {
        if(i % j == 0) total +=j;
            }
            if (total == i){
                System.out.print(i + "   ");
            }
        }
            //System.out.println();
    }
}
