package classwork.arrayclass;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
int sum = 0;
int maximum= Integer.MIN_VALUE;
int minimum = Integer.MAX_VALUE;
        int [] studentScore = new int [10];
        int [] newStudentScore = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.println("enter a score");
            studentScore[i] = input.nextInt();
            newStudentScore[i] = studentScore[i];
            sum += studentScore[i] ;

            if (studentScore[i] > maximum){
                maximum = studentScore[i];
            }

            if (studentScore[i] < minimum  ){
                minimum = studentScore[i];
            }
        }
        for(int i = 0; i < 10; i++) {
            System.out.print(newStudentScore[i]+ " ");
        }
        System.out.println();
        System.out.println(sum);
        double average = (sum/ 10.0) ;
        System.out.printf("the average is %.1f%n", average);
        System.out.println("Maximum value is "+maximum);
        System.out.println( "Minimum value is "+minimum);

    }
}
