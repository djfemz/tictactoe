package chapterTwo;
import java.util.Scanner;


public class Arithmetic {

        public static void main(String... args){

            Scanner number=new Scanner(System.in);

            System.out.println("Enter first integer");
            int number1 = number.nextInt();

            System.out.println("Enter second integer");
            int number2= number.nextInt();

            int sum= (number1 + number2);
            System.out.printf("the sum is %d%n",  sum);

            int product= (number1 * number2);
            System.out.printf("the product is %d%n", product);

            int difference= (number1 - number2);
            System.out.printf("the difference is %d%n", difference);

            double quotient= (number1 *1.0) / (number2*1.0);
            System.out.printf("the quotient is %.2f%n", quotient);

        }

    }

