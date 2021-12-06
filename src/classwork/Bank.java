package classwork;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int response= 0;
        Account userAccount;

        do{
            String prompt= """
                 Welcome to Zenith Bank, thank you for banking with us.
                 press 1 to create an account
                 press 2 to exit
                     """;
            System.out.println(prompt);
            response = input.nextInt();
            switch (response){
                case 1:
                    input.nextLine();
                    System.out.println("Enter your FullName");
                    String fullName = input.nextLine();

                    System.out.println("Enter your pin\n");
                    String pin = input.nextLine();
                    userAccount = new Account(fullName,pin);

                    System.out.println("Welcome on board, your have successfully created an account");

                    do {
                        String NewPrompt= """
                 Welcome to Zenith Bank, thank you for banking with us.
                 press 1 for deposit
                 press 2 for withdrawal
                 press 3 to check balance
                 press 4 to go back
                 press 5 to exit
                     """;
                        System.out.println(NewPrompt);
                      int userResponse = input.nextInt();
                      switch (userResponse){
                          case 1:
                              System.out.println("\"Enter amount to deposit\"");
                              int amount = input.nextInt();
                              userAccount.deposit(amount);
                              System.out.println("Your have credited your account");

                          case 2:
                              System.out.println("enter the amount to withdraw");
                              int withdrawal = input.nextInt();
                              System.out.println("Enter your pin\n");
                              String userpin = input.nextLine();
                      }
                    }
                    while(true);
                case 2: System.exit(0);
            }
        }
        while (true);
    }
}
