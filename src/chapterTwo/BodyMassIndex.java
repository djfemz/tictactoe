package chapterTwo;

import java.util.Scanner;
public class BodyMassIndex{

    public static void main(String... args){

        Scanner bodyMass = new Scanner(System.in);

        System.out.println("Enter weight in Kilogram");
        double weightInKilogram = bodyMass.nextDouble();


        System.out.println("Enter height in meters");
        double heightInMeter = bodyMass.nextDouble();

        double BMI = (weightInKilogram/ (heightInMeter * heightInMeter));

        if (BMI < 18.5){
            System. out.println("Underweight");
        }

        if (BMI >=18.5){
            if (BMI <=24.5){
                System.out.println("Normal");
            }
        }


        if (BMI >=25){
            if (BMI <=29.9){
                System.out.println("Overweight");
            }
        }

        if (BMI > 30){
            System. out.println("Obese");
        }

    }
}
