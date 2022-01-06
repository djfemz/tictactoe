package practice;

public class MathClass {

    public double power(double number, int exponent){
        double result = 1;
        for(int i = 0; i< exponent; i++){
            result = result * number;
        }
        return result;
    }

    public double squareRoot(int number) {

        double i;
        double j = 1;
        for( i = 1; i<= number ; i++){
            if (i*i == number){return i;}
        }
        return 0;
    }

}
