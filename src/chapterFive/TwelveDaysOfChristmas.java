package chapterFive;

import java.util.Scanner;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String Option = """
                1. Twelfth day
                2. Eleventh day
                3. Tenth day
                4. ninth day
                5. eighth day
                6. Seventh day
                7. Sixth day
                8. Fifth day
                9. Fourth day
                10. Third day
                11. Second day
                12. First day
                """;
        System.out.println(Option);
        System.out.println("\"Enter Option\"");
      int select = input.nextInt();

        switch (select) {
            case 1 -> System.out.println("On the Twelfth day of Christmas, my true love sent to me");
            case 2 -> System.out.println("On the eleventh day of Christmas, my true love sent to me");
            case 3 -> System.out.println("On the tenth day of Christmas, my true love sent to me");
            case 4 -> System.out.println("On the ninth day of Christmas, my true love sent to me");
            case 5 -> System.out.println("On the eighth day of Christmas, my true love sent to me");
            case 6 -> System.out.println("On the seventh day of Christmas, my true love sent to me");
            case 7 -> System.out.println("On the sixth day of Christmas, my true love sent to me");
            case 8 -> System.out.println("On the fifth day of Christmas, my true love sent to me");
            case 9 -> System.out.println("On the fourth day of Christmas, my true love sent to me");
            case 10 -> System.out.println("On the third day of Christmas, my true love sent to me");
            case 11 -> System.out.println("On the second day of Christmas, my true love sent to me");
            case 12 -> System.out.println("On the first day of Christmas, my true love sent to me");

        }
            for(int i = 1; i < 2; i++) {
                switch (select) {
                    case 1 : System.out.println("Twelve, Drummers Drumming");
                    case 2 : System.out.println("Eleven, Pipers Piping");
                    case 3 : System.out.println("Ten, Lords a leaping");
                    case 4 : System.out.println("Nine, Ladies Dancing");
                    case 5 : System.out.println("Eight, Maids a Milking");
                    case 6 : System.out.println("Seven, Swarms a Swimming");
                    case 7 : System.out.println("Six, Geese a Laying");
                    case 8 : System.out.println("Five, Golden Rings");
                    case 9 : System.out.println("Four, Calling Birds");
                    case 10 : System.out.println("Three, Fresh Hens");
                    case 11 : System.out.println("Two, Turtle Doves");
                    case 12 : System.out.println("And a Partridge in a pear tree");
                }
            }
    }
}
