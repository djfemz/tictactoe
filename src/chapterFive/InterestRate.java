package chapterFive;

public class InterestRate {
    public static void main(String[] args) {
        double amount;
        double principal = 1000;

        for (double rate =0.05 ; rate <= 0.10 ; rate +=0.01){
        for (int year = 1; year <= 10; year++) {
            amount = principal * Math.pow(1.0 + (rate), year);
            System.out.printf("%3d  %,4.2f%,20.2f%n", year, rate, amount);
        }
            System.out.println();
        }
    }
}
