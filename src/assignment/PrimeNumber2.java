package assignment;




public class PrimeNumber2 {
    public static void main(String[] args) {

//        int counter = 0;
//        int num = 0;
//        int count = 0;
//        for ( num = 1; num <= 10_000; num++) {
//            for (num = count; num >= 1; num--){
//
//                if (num % count == 0) {
//                    counter++;
//
//                }
//                if (counter == 2) {
////                    primeNumbers = primeNumbers +
//                    System.out.print(num+ " ");
//                }
//            }
//        }
//        if (count % 10 == 0){
//            System.out.println();
//        }
        int count = 0;
        int primeNumber = 0;

        for (int score =2; score <= 10_000; score++){
        for (int num =2; num < score; num++){

            if (score % num == 0) {
                primeNumber = score;
                System.out.print("");

            }
            }
            if (score != primeNumber){
                System.out.println(score);

        }

        }

        }
    }


