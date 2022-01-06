package chapterFive;

public class SumOfASeries {
    public static void main(String[] args) {

            System.out.println("Numbers" + "   " + "Sum of the row");
        System.out.println("-".repeat(24));
        long total = 0;
        for (int i = 1 ; i <=100; i++){
            for (int j = i ; j > 0; j--){
            }
                total +=  i;
        System.out.printf("%4d%10d%n", i , total);

        }
    }
}
