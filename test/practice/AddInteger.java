package practice;

public class AddInteger {
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int modules(int firstNumber, int secondNumber) {
        if (firstNumber % secondNumber == 0) return 0;
        return 1;
    }

    public int add(int firstNumber, int secondNumber) {
        return (firstNumber+ secondNumber);
    }
}
