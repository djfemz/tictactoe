package chapterTwo;

import java.util.Scanner;
public class Integers {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Number");
        int firstNumber = input.nextInt();

        System.out.println("Enter second Number");
        int secondNumber = input.nextInt();

        System.out.println("Enter third number");
        int thirdNumber = input.nextInt();

        System.out.println("Enter fourth number");
        int fourthNumber = input.nextInt();

        System.out.println("Enter fifth number");
        int fifthNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                if (firstNumber > fourthNumber) {
                    if (firstNumber > fifthNumber) {
                        System.out.printf("%d is the largest number%n", firstNumber);
                    }
                }
            }
        }

        if (firstNumber < secondNumber) {
            if (firstNumber < thirdNumber) {
                if (firstNumber < fourthNumber) {
                    if (firstNumber < fifthNumber) {
                        System.out.printf("%d is the smallest%n", firstNumber);
                    }
                }
            }
        }


        if (secondNumber > firstNumber) {
            if (secondNumber > thirdNumber) {
                if (secondNumber > fourthNumber) {
                    if (secondNumber > fifthNumber) {
                        System.out.printf("%d is the largest number%n", secondNumber);
                    }
                }
            }
        }

        if (secondNumber < firstNumber) {
            if (secondNumber < thirdNumber) {
                if (secondNumber < fourthNumber) {
                    if (secondNumber < fifthNumber) {
                        System.out.printf("%d is the smallest%n", secondNumber);
                    }
                }
            }
        }


        if (thirdNumber > secondNumber) {
            if (thirdNumber > firstNumber) {
                if (thirdNumber > fourthNumber) {
                    if (thirdNumber > fifthNumber) {
                        System.out.printf("%d is the largest number%n", thirdNumber);
                    }
                }
            }
        }

        if (thirdNumber < secondNumber) {
            if (thirdNumber < firstNumber) {
                if (thirdNumber < fourthNumber) {
                    if (thirdNumber < fifthNumber) {
                        System.out.printf("%d is the smallest%n", thirdNumber);
                    }
                }
            }
        }

        if (fourthNumber > secondNumber) {
            if (fourthNumber > thirdNumber) {
                if (fourthNumber > firstNumber) {
                    if (fourthNumber > fifthNumber) {
                        System.out.printf("%d is the largest number%n", fourthNumber);
                    }
                }
            }
        }

        if (fourthNumber < secondNumber) {
            if (fourthNumber < thirdNumber) {
                if (fourthNumber < firstNumber) {
                    if (fourthNumber < fifthNumber) {
                        System.out.printf("%d is the smallest%n", fourthNumber);
                    }
                }
            }
        }

        if (fifthNumber > secondNumber) {
            if (fifthNumber > thirdNumber) {
                if (fifthNumber > fourthNumber) {
                    if (fifthNumber > firstNumber) {
                        System.out.printf("%d is the largest number%n", fifthNumber);
                    }
                }
            }
        }

        if (fifthNumber < secondNumber) {
            if (fifthNumber < thirdNumber) {
                if (fifthNumber < fourthNumber) {
                    if (fifthNumber < firstNumber) {
                        System.out.printf("%d is the smallest%n", fifthNumber);
                    }
                }
            }
        }

    }
}
