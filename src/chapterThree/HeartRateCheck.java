package chapterThree;

import java.util.Scanner;

public class HeartRateCheck {
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

        HeartRates name = new HeartRates(firstName,lastName, month, day, year );
        System.out.printf("Dear %s %s, Your date  of birth is: %d/%d/%d%n", name.getFirstName(), name.getLastName(),
                name.getMonth(), name.getDay(), name.getYear());
        System.out.printf("Your Age is %d%n", name.getAge());
        System.out.printf("Your Maximum Heart Rate is %d%n", name.getMaximumHeartRate());
        System.out.printf("Your Target Heart Rate is %.2f", name.getTargetHeartRate());
    }
}
