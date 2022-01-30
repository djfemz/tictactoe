package chapterFour;

public class WorldPopulationGrowth {
    public static void main(String[] args) {

        double currentWorldPopulation = 7_900_000_000.00;
        double annualIncrease = 0.0105;

        System.out.println("S/N \tcurrentPopulation \t growthRate");
        for (int i = 1; i <= 75; i++) {
            double growthRate =  currentWorldPopulation;
            currentWorldPopulation += (currentWorldPopulation * annualIncrease);
     System.out.printf("%d\t\t%.2f\t\t %.2f%n", i,growthRate,currentWorldPopulation);

       }
    }
}
