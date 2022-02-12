package classwork;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Invoice2 {
    static Scanner inputCollector = new Scanner(System.in);
    static ArrayList<String> itemBought = new ArrayList<>();
    static ArrayList<Double> amountOfItem = new ArrayList<>();
    static ArrayList<Integer> quantityOfItem = new ArrayList<>();
    static ArrayList <Double> total = new ArrayList<>();

    public static void main(String[] args) {
        questionToAnswer();

        System.out.println("enter y for more and n to exit");
        String option = inputCollector.nextLine().toLowerCase();

      do{

           questionToAnswer();
          System.out.println("enter y for more and n to exit");
           option = inputCollector.nextLine();
       }
      while (!Objects.equals(option.toLowerCase(), "n"));
       printReceipt();
    }

    private static void questionToAnswer() {

            System.out.println("enter the item bought");
            String input = inputCollector.nextLine();
            itemBought.add(input);
            System.out.println("Enter the amount");
            double input1 = inputCollector.nextDouble();
            amountOfItem.add(input1);
            System.out.println("Enter the quantity bought");
            int input2 = inputCollector.nextInt();
            quantityOfItem.add(input2);
            total.add(input1 * input2);
            inputCollector.nextLine();
        }

   private static void printReceipt() {

//       for (String i : itemBought){
//           System.out.print(i + " ");
//       System.out.println();}
//       for (Double j : amountOfItem){
//               System.out.print(j + " ");
//       System.out.println();}
//       for (Integer k : quantityOfItem) {
//           System.out.print(k);
//           System.out.println();
//       }
       for (int i = 0; i < itemBought.size(); i++) {
           System.out.printf("%s\t\t%.2f\t\t%d\t%.2f%n",itemBought.get(i),amountOfItem.get(i),
                   quantityOfItem.get(i), total.get(i));
       }
       double total2 = 0;
       for (Double i: total) {
           total2 += i;
       }
       System.out.printf("\t\t\t\t\t%.2f",total2);

   }

}
