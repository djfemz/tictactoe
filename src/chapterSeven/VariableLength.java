package chapterSeven;

import java.util.Scanner;

public class VariableLength {
    public static void main(String[] args) {
        output();
    }

    public static double average(double... inputs) {
        int total = 0;
        for (double grade : inputs) total += grade;

        return (double) total / inputs.length;
    }

    public static void output(){
        Scanner input =new Scanner(System.in);
        final int no_0f_grade_to_input = 12;
        double [] grade = new double[no_0f_grade_to_input];
        System.out.println("Enter " + no_0f_grade_to_input + " grades");
        int count = 1;
        for (int i = 0; i < grade.length; i++){
            System.out.println("Enter grade for student " + count);
        grade[i] = input.nextInt();
         count++;
        }
            System.out.printf("The average grade is %.2f ",average(grade));
    }

}
