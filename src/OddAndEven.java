

public class OddAndEven {
    public static void main(String[] args) {


//        int number = 1;
//        int number2 = 2;
//        while (number < 100) {
//            System.out.print(number+ " " );
//
//            number = number + 2;
//        }
//        System.out.println();
//        while (number2 <= 100){
//            System.out.print(number2+ " ");
//
//            number2 = number2 + 2;
//        }
//
        int number = 1;

        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
            number = number + 1;
        }
        System.out.println();

        int number2 = 1;
        while (number2 <=100) {
            if (number2 % 2 != 0)
            {
                System.out.print(number2 + " ");
            }

            number2 = number2 + 2;
        }
//while (number >= 100) {
//    if (number % 2 == 1) {
//        System.out.println(number + " ");
//    }
//    number = number + 1;
}
    }
