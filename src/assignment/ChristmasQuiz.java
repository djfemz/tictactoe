package assignment;

import java.security.SecureRandom;

import java.util.Objects;
import java.util.Scanner;

public class ChristmasQuiz {

    private static final SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args) {

        userQuestion();

    }

    public static void christmasQuestion(String [] array){
Scanner input =new Scanner(System.in);
        int count = 1;
        String selection = " ";
        String [] selectionArray = new String[20];

        for(int i= 0; i < 5; i++){

int j = randomNumbers.nextInt(20);
            System.out.println(count++ + " "+ array[j]);
  selection = input.nextLine();


//        for (int i =0; i < selectionArray.length; i++) {
            selectionArray[j] = selection;
           // System.out.println(selectionArray[j]);
        }
compare(selectionArray,answers());
    }
    public static void userQuestion() {
        String[] array = new String[20];
        array[0] = """
                When is Christmas celebrated?\s
                (a) 13th of April
                (b) 25th Of December
                (c) 16th of October\s""";
        array[1] = """
                The traditional Christmas tree originated from which country?\s
                 (a) Germany
                 (b) Greece
                 (c) France\s""";
        array[2] = """
                Name the first US president who decorated the Christmas tree at the White House.
                (a) Barack Obama
                (b) Mohammed Buhari
                (c) Franklin Pierce""";
        array[3] = """
                Where did the word Christmas originate?
                (a) Cristes Maesse
                (b) Christ France
                (c) Franklin Nigeria""";
        array[4] = """
                Why is Christmas celebrated?
                 (a) For Mohammed
                 (b) For the birth of Moses
                 (c) For the birth of Christ""";
        array[5] = """
                The short version of Christmas is also known as what?\s
                 (a) Xmas
                 (b) XChrist
                 (c) Xray""";
        array[6] = """
                What does the red color of Christmas symbolize?
                 (a) blood of God
                 (b) blood of Jesus
                 (c) blood of the spirit""";
        array[7] = """
                What does the green color of Christmas signify?
                 (a) Continuity of life
                 (b) Continuity
                 (c) fertile ground""";
        array[8] = """
                What does mistletoe symbolize?
                (a) Barrier
                (b) Sluggishness
                (c) Love, laughter, and compassion.""".indent(1);
        array[9] = "Christmas was once banned in Boston. True or false?\n (a) True\n  (b) false";
        array[10] = """
                What is the use of a tree skirt?\s
                 (a) Gifts are placed there
                 (b) To store the tree
                 (c) To save money""";
        array[11] = """
                What did the three wise men gift baby Jesus?
                (a) Gold, Frankincense and Money
                (b) Gold, Frankincense and Myrrh
                (c) Gold, Folder and Myrrh""";
        array[12] = """
                What is Christmas originally known as?
                 (a) Gold
                 (b) Xmas
                 (c) Yule""";
        array[13] = """
                Where was Jesus born?\s
                (a) Borno
                (b) Bethlehem
                (c) Benue""";
        array[14] = """
                Which famous scientist was born on 25 December?\s
                 (a) Isaac Newton
                 (b) Lord Luggard
                 (c) Charles Darwin""";
        array[15] = """
                Which famous Christmas carol talks about the gifts received during the twelve days of Christmas?\s
                 (a) The Seven days of the week
                 (b) The Twelve Days Of Christmas
                 (c) The Twelve months of the year""";
        array[16] = """
                Which famous poem popularized Santa?
                 (a) Twas the day of Christmas
                 (b) Twas the boxing day
                 (c) Twas the Night Before Christmas""";
        array[17] = """
                Which popular Christmas song was played in space?
                 (a) Jingle bells
                 (b) Twelve days of Christmas
                 (c) London bridge is falling down""";
        array[18] = """
                 Which country celebrates its Independence day on Christmas Eve every year?
                 (a) Turkey
                 (b) Malaysia
                 (c) Libya""";
        array[19] = """
                What is the duration between Christmas and Epiphany?
                 (a) 40 days
                 (b) 12 days
                 (c) 15days""";

        christmasQuestion(array);

    }

     public static String[] answers() {
            String[] array2 = new String[20];
            array2[0] = "b";
            array2[1] = "a";
            array2[2] = "c";
            array2[3] = "a";
            array2[4] = "c";
            array2[5] = "a";
            array2[6] = "b";
            array2[7] = "a";
            array2[8] = "c";
            array2[9] = "a";
            array2[10] = "a";
            array2[11] = "b";
            array2[12] = "c";
            array2[13] = "c";
            array2[14] = "a";
            array2[15] = "b";
            array2[16] = "c";
            array2[17] = "a";
            array2[18] = "c";
            array2[19] = "b";

         return array2;

        }
        public static void compare(String[] array, String[] array2 ){
        int i = 0;
        int count = 0;
        for (i = 0; i < array.length; i++){
            if(Objects.equals(array[i], array2[i])){
                count++;
            }
        }
            System.out.println("You scored "+count + " answers correctly");
        if(count == 5){
            System.out.println("Congratulations.... Merry Christmas");
        }
       else if (count == 4){
            System.out.println("Congratulations... Merry Christmas");
        }
         else   if (count == 3){
                System.out.println("You can get better at it");
            }
            else System.out.println("Get to know more about Christmas");
        }
}
