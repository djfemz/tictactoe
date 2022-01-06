package assignment;

import java.util.Scanner;

public class Decryptography {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("\"Enter four digits\"");
        int digit = input.nextInt();


        int firstdigit= (digit / 1000) ;

        int seconddigit = ((digit % 1000)/100);

        int thirddigit = (digit % 100)/ 10;

        int fourthdigit = ((digit% 10)/ 1) ;


        int firstdigit2 = thirddigit;
        int seconddigit2 = fourthdigit;
        int thirddigit2 = firstdigit;
        int fourthdigit2 = seconddigit;

        int first = ((((thirddigit2 / 10)  * 10) -7) / 10) + 1;
        int second = ((((fourthdigit2  / 100) % 1000) -7) / 10) + 2 ;
        int third = ((firstdigit2 + 10) -7);
        int fourth = ((seconddigit2 + 10) -7);

       System.out.print(first+ " ");
       System.out.print(second+ " ");
        System.out.print(third+ " ");
        System.out.print(fourth+ " ");

    }
}
