package chapterFive;

public class TrianglePrinting2 {
    public static void main(String[] args) {

        for(int i = 1 ;i <= 10; i++){
            for (int j= 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int p = i; p <= 10; p++) {
                System.out.print("  ");
            }
            for (int c = i; c <= 10; c++) {
                System.out.print("* ");
            }
            for (int a= 1; a <= i; a++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for (int b= i ; b <= 10; b++){
                System.out.print("* ");
            }
            for (int b=i ; b <= 10; b++){
                System.out.print("  ");
            }

            for (int b = 1 ; b <= i; b++){
                System.out.print("* ");
            }

            System.out.println();
        }

        }

    }

