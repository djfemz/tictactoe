package classwork;

public class Kata2 {

    public static String getResultOf(int userInput) {
        String grade = " ";
        if (userInput >= 90) grade = "A";


        if ((userInput <= 89) && (userInput >= 80)) grade = "B";


        if ((userInput <= 79) && (userInput >= 70)) grade = "C";

        if ((userInput <= 69) && (userInput >= 60)) grade = "D";
        if (userInput < 60) grade = "F";

        return grade;

    }

    public static void outputArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printTable(){

        String str = "-";
        String repeated = str.repeat(20);

        System.out.println(repeated);
    }

    public static void main(String[] args){
        int [] [] array = {{1, 2, 3, 4}, {1,2,3,4,5}, {1,2,3,4}, {1,2,3,4,5,6,7,8,9},{}};
        printTable();
        System.out.println("\t Table");
        printTable();
        outputArray(array);
        printTable();
    }
}



