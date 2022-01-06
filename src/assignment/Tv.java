package assignment;

import java.util.Scanner;

public class Tv {

    private static final Scanner input = new Scanner(System.in);
    public static  Television lG = new Television("lG");

    public static void main(String[] args) {
        displayOption();
    }

    public static void displayOption() {

        int select = 0;

        do {
            String option = """
                    1. Press On
                    2. Press Off
                    """;
            System.out.println(option);
            userInput();

            select = input.nextInt();
            switch (select) {
                case 1 -> switchStatements1();
                case 2 -> {
                    System.out.println("Goodbye");
                    lG.turnOff();
                }
            }
            break;
            }

        while (true);

    }
        public static void userInput () {
            System.out.println("\"Enter Option\"");
        }
        public static void channelSelect(){

            System.out.println("Enter your preferred channel between 1 and 10" );

            int userinput = input.nextInt();
            lG.setChannel(userinput);
            System.out.println("You are on channel "+ lG.getChannel());

        }

        public static void volume(){
            String choice = """
                                             
                            press 1 to increase volume
                            press 2 to decrease volume
                            """;
            System.out.println(choice);
            userInput();
            int select = input.nextInt();
            switch (select) {
                case 1 -> switchSelectForIncreaseVolume();
                case 2 -> switchSelectForDecreaseVolume();
            }
        }
        public static void switchSelectForIncreaseVolume(){
            System.out.println("To increase your volume enter a number between 1 and 99");
            int userInput = input.nextInt();
//           lG.increaseVolume();

            System.out.println("New Volume is " + (userInput +lG.getVolume()));
        }

        public static void switchSelectForDecreaseVolume() {
            System.out.println("To decrease your volume enter a number between 100 and 2");
            int pick = input.nextInt();
            lG.decreaseVolume();
            System.out.println("New Volume is " + (pick - lG.getVolume()));
        }
public static void switchStatements1(){

    lG.turnOn();
    System.out.println("Welcome.. Life is Good with lG");
    String userOption = """
                     
                            1. HDMI 1
                            2. TV
                            3. AVA
                            4. SETTINGS                
                            """;
    System.out.println(userOption);
    userInput();


    int subSelect = input.nextInt();
    switch (subSelect) {
        case 1 -> {
            String userChoice = """
                    Welcome to DsTv.
                    1. Channel
                    2. Volume
                    3. Go back
                     """;
            System.out.println(userChoice);
            userInput();
            int subselect = input.nextInt();
            switch (subselect) {
                case 1 -> channelSelect();

                case 2 -> volume();


                case 3 -> switchStatements1();
            }
        }
        case 2 -> {
            String TvChoice = """
                    1. channel
                    2. volume
                    3. Go back
                    """;
            System.out.println(TvChoice);
            userInput();
            int select = input.nextInt();
            if (select == 1) {
                String channel = """
                        1. ChannelsTv
                        2. LTV
                        3. Galaxy TV
                        4. Silverbird TV
                        5. MITV
                        6. NTA
                        7. Cartoon Network
                        8. Hip Tv
                        9. Naija Tv
                        10.Dove TV
                        """;
                System.out.println(channel);
                userInput();
                int channelSelect = input.nextInt();
                switch (channelSelect) {
                    case 1 -> System.out.println("ChannelsTv");
                    case 2 -> System.out.println("LTV");
                    case 3 -> System.out.println("Galaxy TV");
                    case 4 -> System.out.println("Silverbird Tv");
                    case 5 -> System.out.println("MITV");
                    case 6 -> System.out.println("NTA");
                    case 7 -> System.out.println("Cartoon Network");
                    case 8 -> System.out.println("Hip Tv");
                    case 9 -> System.out.println("Naija Tv");
                    case 10 -> System.out.println("Dove Tv");
                    default -> System.out.println("invalid option");
                }
            }
            if(select == 2) volume();
        }
    }
    

}
    }

