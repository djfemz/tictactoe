package chapterThree;

public class DateTest{

    public static void main(String... args){

        Date displayDate = new Date(11, 13, 2021);

        System.out.printf("Today's date is: %d/%d/%d", displayDate.getMonth(), displayDate.getDay(), displayDate.getYear());



    }
}
