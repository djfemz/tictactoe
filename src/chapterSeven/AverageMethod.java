package chapterSeven;

public class AverageMethod {
    public static void main(String[] args) {

        double grade1 = 15.0;
        double grade2 = 60.0;
        double grade3 = 90.0;
        double grade4 = 150.0;
        System.out.printf(" grade1= %.1f%n grade2= %.1f%n grade3= %.1f%n grade4= %.1f%n",
                grade1, grade2, grade3, grade4);

        System.out.printf("The average of grade1 and grade2 is %.1f%n", getAverage(grade1,grade2));
        System.out.printf("The average of all the grades is %.1f%n", getAverage(grade1,grade2,grade3,grade4));
        System.out.println("The product of all the grade is " + product(grade1, grade2,grade3,grade4));
        }



    public static double getAverage(double... numbers){
        int total = 0;

        for(double grade: numbers) total+=grade;

        return (double) total / numbers.length;
    }

    public static int product(double... numbers){
        int total = 1;

        for(double grade: numbers) total *= grade;
       return total;
    }
}
