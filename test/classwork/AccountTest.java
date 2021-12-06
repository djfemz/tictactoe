package classwork;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    private Account myAccount = new Account("EstherJacinta", "0981");

    @Test
    public void accountCanBeCreated(){

        String myName = myAccount.getAccountName();
        assertEquals("EstherJacinta", myName);
    }

    @Test
    public void balance(){
        int myBalance = myAccount.getBalance("0981");
        assertEquals(50_000, myBalance);

    }

    @Test
    public void depositAmount(){
        myAccount.deposit(5_000);
        int myDeposit = myAccount.getBalance("0981");
        assertEquals(55_000, myDeposit);
    }

    @Test
    public void noNegativeDeposit(){
        myAccount.deposit(-5_000);
        int myDeposit = myAccount.getBalance("0981");
        assertEquals(50_000, myDeposit);
    }


    @Test
    public void withdrawAmount(){
    myAccount.withdrawAmount(5_000, "0981");
    int withdrawal = myAccount.getBalance("0981");
    assertEquals(45_000,withdrawal);
    }

    @Test
    public void cannotWithdrawNegativeAmount(){
        myAccount.withdrawAmount(-5_000, "0981");
        int withdrawal = myAccount.getBalance("0981");
        assertEquals(50_000,withdrawal);
    }

    @Test
    public void cannotWithdrawMoreThanBalance(){
        myAccount.withdrawAmount(55_000, "0981");
        int withdrawal = myAccount.getBalance("0981");
        assertEquals(50_000,withdrawal);
    }

    @Test
    public void cannotWithdrawWithWrongPin(){
        myAccount.withdrawAmount(55_000, "0781");
        int withdrawal = myAccount.getBalance("0981");
        assertEquals(50_000,withdrawal);
    }

    @Test
    public void withdrawWithWrongPinReturnsZero(){
        myAccount.withdrawAmount(55_000, "0981");
        int withdrawal = myAccount.getBalance("0781");
        assertEquals(0,withdrawal);
    }
}
