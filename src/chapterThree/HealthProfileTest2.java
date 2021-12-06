package chapterThree;

import java.util.Scanner;

public class HealthProfileTest2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter FirstName");
        String firstName = input.next();

        System.out.println("Enter LastName");
        String lastName = input.next();

        System.out.println("Month of Birth");
        int month = input.nextInt();

        System.out.println("Year of Birth");
        int year = input.nextInt();

        System.out.println("Day of Birth");
        int day = input.nextInt();

        System.out.println("Gender");
        String gender = input.next();

        System.out.println("Weight in Pound");
        double weight = input.nextInt();

        System.out.println("Height in Meter");
        double height = input.nextInt();

        HealthProfile name = new HealthProfile(firstName,lastName, month, day, year, gender, height, weight );
        System.out.printf("Dear %s %s, Your date  of birth is: %d/%d/%d%n", name.getFirstName(), name.getLastName(),
                name.getMonth(), name.getDay(), name.getYear());
        System.out.printf("You are %d years old%n", name.getAge());
        System.out.printf("Your BMI is %f%n ", name.getBodyMassIndex());
        System.out.printf("Your Maximum Heart Rate is %d%n", name.getMaximumHeartRate());
        System.out.printf("Your Target Heart Rate is %.2f", name.getTargetHeartRate());
    }
}
