package classwork;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {
       static  ArrayList<Double> secretaryResponse2 = new ArrayList<>();
       static ArrayList<String> secretaryResponse = new ArrayList<>();

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);
        promptSecretaryForQuestion1();


        System.out.println("Press 1 for more and 2 to exit ");
        int response = inputCollector.nextInt();
        do {
            promptSecretaryForQuestion1();
            System.out.println("Press 1 for more and 2 to exit ");
            int response1 = inputCollector.nextInt();
            if (response1 == 1) promptSecretaryForQuestion1();
            else System.exit(2);
        }
        while (response != 2);


    }

    public static void promptSecretaryForQuestion1() {


        Scanner inputCollector = new Scanner(System.in);
        System.out.println("What was the item bought ");
        String response = inputCollector.nextLine();

        System.out.println("How much is the item");
        double response1 = inputCollector.nextDouble();
        System.out.println("Enter the quantity bought");
        int response2 = inputCollector.nextInt();
        double finalResponse = response1 * response2;
        secretaryResponse2.add(finalResponse);
        //System.out.println(secretaryResponse2);
        secretaryResponse.add(response);

        System.out.printf("%s %.2f%n", secretaryResponse, finalResponse);

    }
}
