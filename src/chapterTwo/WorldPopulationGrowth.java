package chapterTwo;

public class WorldPopulationGrowth{

    public static void main(String[] args){

        double currentWorldPopulation = 7906863260.00;
        double annualIncrease = 0.0105;

        double estimatedWorldPopulationYear1 = (currentWorldPopulation * annualIncrease) + currentWorldPopulation;
        System.out.printf("The estimated world population after the first year is %.2f%n", estimatedWorldPopulationYear1);


        double estimatedWorldPopulationYear2 = (estimatedWorldPopulationYear1 * annualIncrease) + estimatedWorldPopulationYear1;
        System.out.printf("The estimated world population after the second year is %.2f%n", estimatedWorldPopulationYear2);


        double estimatedWorldPopulationYear3 = (estimatedWorldPopulationYear2 * annualIncrease) + estimatedWorldPopulationYear2;
        System.out.printf("The estimated world population after the third year is %.2f%n", estimatedWorldPopulationYear3);


        double estimatedWorldPopulationYear4 = (estimatedWorldPopulationYear3 * annualIncrease) + estimatedWorldPopulationYear3;
        System.out.printf("The estimated world population after the fourth year is %.2f%n", estimatedWorldPopulationYear4);


        double estimatedWorldPopulationYear5 = (estimatedWorldPopulationYear4 * annualIncrease) + estimatedWorldPopulationYear4;
        System.out.printf("The estimated world population after the fifth year is %.2f", estimatedWorldPopulationYear5);


    }
}
