package chapterTwo;


import java.util.Scanner;
    public class Circle{
        public static void main(String... args){

            Scanner number= new Scanner(System.in);
            System.out.println("enter radius");
            double radius = number.nextDouble();

            double diameter = (2 * radius);
            System.out.printf("The diameter is %.2f%n", diameter);

            double circumference = (2 * 3.142 * radius);
            System.out.printf("The circumference is %.2f%n", circumference);

            double area = (3.142 * radius * radius);
            System.out.printf("The area is %.2f%n", area);

        }
    }

