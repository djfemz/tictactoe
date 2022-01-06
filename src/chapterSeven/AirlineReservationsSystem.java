package chapterSeven;

import java.util.Scanner;

public class AirlineReservationsSystem {
       // int capacity_length = 10;
   // private static final   int [] capacity =new  int [10];
    private enum Seat{FIRSTCLASS, ECONOMY};
    public static void main(String[] args) {
        bookSeat();
    }
    public static void bookSeat(){
        int [] capacity = new int[10];
        String bookSeat = """
                Please type 1 for First Class.
                Please type 2 for Economy.
                """;
        System.out.println(bookSeat);
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        if (select == 1) {
            System.out.println("Yor seat number is "); setCapacity(capacity);
        }
        if(select== 2){setCapacity(capacity);}
    }
    private static void setCapacity(int []capacity) {
        Seat bookSeat;
        for (int i = 1; i < capacity.length; i++) {
             for (int j = 0; j < capacity[i]; j++) {
            if (capacity[j] <= 5) {bookSeat = Seat.FIRSTCLASS;
                System.out.println(i);}
            else {bookSeat = Seat.ECONOMY;
                System.out.println(bookSeat);}
              }
        }

    }
}
