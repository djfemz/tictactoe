package assignment;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("\"Enter four digits\"");
        int digit = input.nextInt();

        int firstdigit= ((digit / 1000) + 7)% 10;

        int seconddigit = (((digit % 1000)/100)  + 7) % 10;

        int thirddigit = (((digit % 100)/ 10)  + 7) % 10;

        int fourthdigit = (((digit% 10)/ 1)  + 7) % 10;

//        System.out.print((firstdigit % 10)+ " ");
//        System.out.print((seconddigit % 10)+ " ");
//        System.out.print((thirddigit % 10)+ " ");
//        System.out.println((fourthdigit % 10)+ " ");

        int firstdigit2;
        int seconddigit2;
        int thirddigit2;
        int fourthdigit2;

        firstdigit2 = thirddigit;
        thirddigit2 = firstdigit;
        seconddigit2 = fourthdigit;
        fourthdigit2 = seconddigit;
        System.out.print(firstdigit2);
        System.out.print(seconddigit2);
        System.out.print(thirddigit2);
        System.out.print(fourthdigit2);





    }
}
