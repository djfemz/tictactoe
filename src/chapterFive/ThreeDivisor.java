package chapterFive;

public class ThreeDivisor {
    public static void main(String[] args) {

        int total = 0;
        for(int i = 1; i <= 30 ; i++){
            if (i % 3 == 0){
                total+= i;
            }
        }
        System.out.println("The total of the divisor of 3 from 1 t0 30 is " + total);
    }
}
