package chapterSeven;

    import java.util.*;
public class AirlineLight {

    public static class Airline {

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);      // You will be communication with the user,
            // so the scanner object "input" is initiated
            // declare, allocate, and initialize all variables necessary
            int choice = 0;
            int[] seats = new int[10];
            boolean full = false;                        // at the start, plane is not full, so this
            // variable is initialized to false
            // ---------------------------------------------------------
            // initialize empty seats in the plane
            for (int i = 0 ; i <10; i++)
            {
                seats[i] = 0;
            }
            // ---------------------------------------------------------
            intro();                                     // print welcoming message; the function intro()
            // neither accepts (empty inside brackets)
            // nor returns any parametrs (no equals "=" sign needed)
            while (full == false)                        // passengers should be asked to select
            {                                            // seats until the plane gets full
                System.out.println("What is your choice?");
                choice = input.nextInt();
                if (seats[choice-1] == 1)                  // checks if the selected seat is full
                {
                    System.out.println("Sorry. This seat is taken! Please choose another seat...");
                    System.out.println();
                }
                else                                       // if it is not full then allow the system
                {                                          // to book the selected seat
                    if ((choice >= 1) && (choice <= 5))      // business class
                    {
                        seats[choice-1] = 1;
                    }
                    else if ((choice >= 6) && (choice <= 10))// economy class
                    {
                        seats[choice-1] = 1;
                    }
                    else
                    {
                        System.out.println("Sorry. You have entered a wrong seat number!");
                    }
                }
                display_seat_chart(seats);                 // after each round show the current seating chart;
                // this function accepts 1 input parameter
                // (a seat[] array), but does not return anything,
                // hence no "=" sign to the left of it
                full = is_full(seats);                     // after each round check if plane is full
                // to update the boolean varialbe full,
                // this function accepts 1 input parameter
                // (a seat[] array), but does return 1 boolean value,
                // hence a "=" sign to the left of it,
                // and a variable of the same type (boolean)
                // is prepared to store the result
            }
            System.out.println("This flight is full. Next flight leaves in 3 hours.");
        }
        // Method headers begin below this line, here you define your methods
        public static void intro ()                    // this function does not accept any input argument
        {                                              // (is empty inside () ) and does not return
            // any output parametrs, hence "void"
            System.out.println("Welcome to Great Airline reservation system!!!");
            System.out.println("We have only one plane, but we welcome you on-board.");
            System.out.println("Please choose a seat:");
            System.out.println("Type 1-5 for business class or");
            System.out.println("Type 6-10 for economy class");
        }
        public static void display_seat_chart(int[] anArray)  // this function does accept 1 input argument
        {                                                     // (has int[] anArray inside () ) and does not
            // return any output parametrs, hence "void"
            System.out.println( "\t\t  Business   | Economy   " );
            System.out.println( "\t\t_________________________" );
            for (int i = 0; i <  5; i++)
            {
                System.out.print( "\t\t      " );
                System.out.print(  anArray[i] );
                System.out.print( "      ");
                System.out.print( "|");
                System.out.print( "      ");
                System.out.println( anArray[i+5]);
            }
        }
        public static boolean is_full(int[] anArray)   // this function does accept 1 input argument
        {                                              // (has int[] anArray inside () ) and does
            // return 1 boolean output parameter, hence "boolean"
            boolean status = false;
            int sum = 0;
            for (int i = 0; i < 10; i++)
            {
                sum = anArray[i] + sum;                    // if the sum of all array elements is 10,
            }                                            // this means that all 10 seats are occupied
            if (sum == 10) return true;                  // plane full, status to return to main() is therefore true
            else return false;                           // plane not full, status to return to main() is therefore false
        }
    }
}
