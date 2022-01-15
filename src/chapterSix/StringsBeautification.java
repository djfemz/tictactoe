package chapterSix;

import java.util.Scanner;

public class StringsBeautification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word ");
        String check = input.nextLine();
addFullStop(check);
    }
    private static void addFullStop(String value){

            if(value.charAt(value.length()-1) != '.') {
                String newNumber = value.concat(".");
                capitalizeFirstValue(newNumber);
            }
    }
    private static void capitalizeFirstValue(String value){
        String newName = value.substring(0,1).toUpperCase();
        String newCapitalizedValue = newName + value.substring(1);
        System.out.println(newCapitalizedValue);
    }
}
