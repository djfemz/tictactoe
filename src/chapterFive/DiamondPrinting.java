package chapterFive;

public class DiamondPrinting {
    public static void main(String[] args) {


        for(int i = 1 ;i <= 9 ; i+=2) {
            for (int j = i; j <= 9; j++) {
                System.out.print(" ");
            }
            for(int j= 1; j <=i; j+=2 ){
                System.out.print("");
            }
            for(int j =1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        for(int i = 1 ;i <= 9 ; i+=2){
//            for (int j = 1; j < i; j++) {
//                System.out.print("" );
//            }
//                for (int k = 9 ; k >= i ; k-- ) {
//                    System.out.print(" *");
//                }
//        System.out.println();
//        }
        for(int i = 1 ;i <= 9 ; i+=2) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j= 1; j < i; j+=2 ){
                System.out.print("");
            }
            for(int j =9; j >= i; j--){
                  System.out.print("* ");
            }
            System.out.println();
        }
    }
}
