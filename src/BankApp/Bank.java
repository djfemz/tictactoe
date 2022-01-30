package BankApp;

import java.util.ArrayList;

public class Bank {
   private ArrayList <Customer> customers;
   private String bankName;
   private String sortCode;

    public Bank(ArrayList<Customer> customers, String bankName, String sortCode) {
        this.customers = customers;
        this.bankName = bankName;
        this.sortCode = sortCode;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }
}
