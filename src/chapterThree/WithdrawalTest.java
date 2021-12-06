package chapterThree;


    import java.util.Scanner;

    public class WithdrawalTest{

        public static void main(String... args){

            Scanner withdrawalAmount = new Scanner(System.in);

            Withdrawal firstAccount= new Withdrawal ("jacinta", 200);

            System.out.printf("%s balance: #%.2f%n", firstAccount.getName(), firstAccount.getBalance());

            System.out.print("Enter deposit amount for firstAccount: ");
            double depositAmount = withdrawalAmount.nextDouble();
            System.out.printf("%nadding to firstNumber balance%n%n", depositAmount);

            firstAccount.deposit(depositAmount);


            System.out.printf("%s balance: #%.2f%n", firstAccount.getName(), firstAccount.getBalance());

            System.out.print("Enter withdrawal amount for firstAccount: ");
            double withdrawal = withdrawalAmount.nextDouble();
            firstAccount.withdrawal(withdrawal);
            System.out.printf("%s balance is %.2f" ,firstAccount.getName(),firstAccount.getBalance());


        }

    }

