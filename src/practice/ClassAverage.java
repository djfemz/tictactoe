package practice;


import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum =0;
        int gradeCounter = 1;

        while (gradeCounter <= 10){
            System.out.print("Enter a Score: ");
            int grade = input.nextInt();

            sum+= grade;

            gradeCounter++;
        }
        System.out.printf("sum is %d" ,sum);
    }
}
