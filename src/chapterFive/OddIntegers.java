package chapterFive;

public class OddIntegers {
    public static void main(String[] args) {

        int total = 1;
        for(int i = 1 ; i <= 15; i++){
            if(i % 2 != 0){
                total *= i;

            }
        }
        System.out.println("The total of odd Integers between 1 and 15 is "+total);
    }
}
