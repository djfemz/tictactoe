package classwork;

public class Score {

    public static int calculateTotalOf(int[] numbers) {
        int total = 0;
       int [] number = numbers;
        for (int score = 0; score < number.length; score++)
        total += number[score];
        return total;
    }


    public static int calculateMinimumOf(int[] numbers) {

        int [] number = numbers;
        int minimumNumber = number[0];
        for (int score = 0; score < number.length; score++){
            minimumNumber = Math.min(minimumNumber, number[0]);
        }

        return minimumNumber;
    }

    public static int calculateMaximumOf(int[] numbers) {
        int [] number = numbers;
        int maximumNumber = number[0];
        for (int score = 0; score < number.length; score++){
            maximumNumber = Math.max(maximumNumber, number[score]);
        }
        return maximumNumber;
    }

    public static int calculateAverageOf(int[] numbers) {
        int total = 0;
        int average = 0;
        int [] number = numbers;
        for (int score = 0; score < number.length; score++)
            total += number[score];
        average = (total/ numbers.length);
        return average;
    }
}
