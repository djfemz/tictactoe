package classwork;

import java.util.Objects;

public class Account {
    private String name;
    private int balance =50_000;

    private String pin;
    public Account(String accountName, String accountPin) {
    name = accountName;
    pin = accountPin;
    }

    public String getAccountName() {
        return name;
    }

    public int getBalance(String accountPin) {
        if(pin.equals(accountPin)) return balance;
        return 0;
    }

    public void deposit(int amount) {
        if (amount > 0) balance+= amount;
    }

    public void withdrawAmount(int withdrawalAmount, String accountPin) {
        if (withdrawalAmount > 0 && withdrawalAmount < balance && Objects.equals(pin, accountPin)) balance -=withdrawalAmount;
    }
}
