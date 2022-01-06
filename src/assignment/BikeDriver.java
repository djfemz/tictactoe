package assignment;

import classwork.Bike;

import java.util.Scanner;

public class BikeDriver {
    private static final Scanner input = new Scanner(System.in);
    public static Bike yahama = new Bike("yahama");

    public static void main(String[] args) {
        displayOption();
    }

    public static void displayOption() {
        int select = 0;

        do {
            String option = """
                    Press 1 to turn On Bike
                    Press 2 to turn Off Bike
                    Press 3 for acceleration
                    press 4 for deceleration
                                       
                    """;
            System.out.print(option);
            System.out.println("\"Enter Option\"");
            select = input.nextInt();
            //  do {
            switch (select) {

                case 1 -> {
                    yahama.turnOn();
                    System.out.print(yahama + " \n");
                }


                case 2 -> {
                    yahama.turnOff();
                    System.out.println(yahama.toString());
                    System.exit(1);
                }
                case 3 -> {
                    do {
                        String subOption = """
                                Press 1 to increase speed by 1
                                Press 2 to increase speed by 2
                                press 3 to increase speed by 3
                                press 4 to increase speed by 4
                                Press 5 to go back to main
                                """;
                        System.out.print(subOption);
                        System.out.println("\"Enter Option\"");
                        select = input.nextInt();
                        switch (select){
                            case 1 -> {
                                System.out.println("gear 1 is from 0 and 20");
                                System.out.println("Enter a number");
                                int userInput = input.nextInt();
                                yahama.turnOn();
                                yahama.acceleration(userInput);
                                System.out.println(yahama.getSpeed());

                            }
                        }

                    }
                    while (true);
                }

                // }
                // while (true);
            }
        }
        while (true);
    }
}
