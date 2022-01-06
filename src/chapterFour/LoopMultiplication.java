package chapterFour;

public class LoopMultiplication {
    public static void main(String[] args) {

        System.out.printf("%s%5s%5s%5s%n","N", "N2", "N3", "N4" );
        for (int i = 1; i <= 5 ; i++){
            System.out.printf("%d%5d%5d%5d%n",i, (int)Math.pow(i,2), (int)Math.pow(i,3),
                    (int)Math.pow(i,4) );
        }
    }
}
