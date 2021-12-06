package chapterTwo;

import java.util.Scanner;
public class Integer{

    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter five digits");
        int digit = input.nextInt();


        int firstdigit= (digit / 10000);
        System.out.println(firstdigit);
        int seconddigit = (digit % 10000)/1000;
        System.out.println(seconddigit);
        int thirddigit = (digit % 1000)/ 100;
        System.out.println(thirddigit);
        int fourthdigit = (digit% 100)/ 10;
        System.out.println(fourthdigit);
        int fifthdigit=(digit % 10)/ 1;
        System.out.println(fifthdigit);

        System.out.printf("%d  %d  %d  %d  %d", firstdigit, seconddigit, thirddigit, fourthdigit, fifthdigit);

    }
}
