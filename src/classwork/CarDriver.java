package classwork;

import java.util.Scanner;

public class CarDriver {
    private static final Scanner input = new Scanner(System.in);
    public static Car toyota = new Car ("toyota");
    public static void main(String[] args) {
        displayOption();
    }

    public static void displayOption() {
        int select = 0;


            String option = """
                    Press 1 to turn On your Car
                    Press 2 to turn Off your Car
                   
                     """;
            System.out.print(option);
            System.out.println("\"Enter Option\"");
            select = input.nextInt();
            switch (select) {

                case 1 -> {
                    toyota.turnOn();
                    System.out.print(toyota + " \n");
                    do {
                        String subOption = """
                                Press 1 for acceleration
                                press 2 for deceleration
                                press 3 to go back
                                        """;

                        System.out.print(subOption);
                        System.out.println("\"Enter Option\"");
                        select = input.nextInt();

                        switch (select) {
                            case 1 -> {
                                toyota.turnOn();
                                toyota.accelerate();
                                // System.out.println(toyota.toString());
                                System.out.println("Your Current Speed is " + toyota.getSpeed()
                                        + "\n Your Current Gear is "+ toyota.getGear());

                                System.out.println();
                            }

                            case 2 -> {
                                toyota.turnOn();
                                toyota.decelerate();
                                // System.out.println(toyota.toString());
                                System.out.println("Your Current Speed is " + toyota.getSpeed()
                                        + "\n Your Current Gear is "+ toyota.getGear());

                                System.out.println();
                            }

                            case 3-> displayOption();

                        }
                    }
                    while (true);
                }


                case 2 -> {
                    toyota.turnOff();
                    System.out.println(toyota.toString());
                    System.exit(1);
                }

            }


    }
}
