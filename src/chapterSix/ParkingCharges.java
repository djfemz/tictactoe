package chapterSix;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = 1;
        while (hour != 0) {
            System.out.println("How many hours did you park at the garage or 0 to exit");
            hour = input.nextInt();
//        int fee = Integer.parseInt(hour);
            if (hour != 0) {
                System.out.println(calculateCharge(hour));
            }
        }
    }
    public static double calculateCharge(int time){
        double minimumFee = 2.00;
        double maximumFee = 10.00;
        int minimumTime = 3;

        double fee;
     if (time <= minimumTime) {
            fee = minimumFee;

     }
        else  if  (time > minimumTime && time < 17){
            fee = minimumFee + (0.50* (time - 3));

        }
      else
          fee = maximumFee;

return fee;
    }
}
