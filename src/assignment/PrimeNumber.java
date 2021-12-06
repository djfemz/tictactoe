package assignment;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();


//        int count = 0;
//        for (int num =2; num<number; num++) {
//
//            if (number % num == 0) {
//                count++;
//
//            }
//
//        }

        int count = 0;
        for (int num =2; num <= number; num++) {

            if (number % num == 0) {
                System.out.print(num + " ");

                count++;
            }
        }


        if (count != 2) {
            System.out.println("it is a prime number");
        }
        else
            System.out.println("it is not a prime number");



//            if (score != primeNumber){
//                System.out.println(score);
//
//            }

        }



    }

