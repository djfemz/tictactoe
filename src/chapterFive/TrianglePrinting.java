package chapterFive;

public class TrianglePrinting {
    public static void main(String[] args) {

        for(int i = 1 ;i <= 10; i++){
            for (int j= 1; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
                for(int i = 1 ;i <= 10; i++){
            for (int j=i ; j <= 10; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

                for(int i = 1 ;i <= 10; i++){
            for (int j=1 ; j <= i; j++){
                System.out.print("  " );
                }
                for (int p = i; p <=10 ; p++){
                    System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();

                for(int i = 1 ;i <= 10; i++){
            for (int j = i ; j <= 10; j++){
                System.out.print("  " );
                }
                for (int p = 1; p <=i ; p++){
                    System.out.print("* ");
            }

            System.out.println();
        }
    }
}
