package BankApp;

public class Account {
    private AccountType type;
    private String number;
    private String name;

    public Account(AccountType type, String number, String name) {
        this.type = type;
        this.number = number;
        this.name = name;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
