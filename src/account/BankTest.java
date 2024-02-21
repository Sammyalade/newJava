package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BankTest {

    private Bank myBank;

    @BeforeEach
    public void initializeMyBank(){
        myBank = new Bank();
    }

    @Test
    public void registerNewAccount_newAccountRegisteredTest(){
        Account myAccount = myBank.registerCustomer("Onome", "Precious", "4455");

        assertEquals(myAccount ,myBank.findAccount(1001));
        myAccount.resetAccountNumber();
    }

    @Test
    public void testThatAccountsHaveDifferentAccountNumber(){
        Account account1 = myBank.registerCustomer("Onome", "Precious", "4455");
        Account account2 = myBank.registerCustomer("Adeleye", "Precious", "1234");

        assertEquals(1001, account1.getNumber());
        assertEquals(1002, account2.getNumber());
        account2.resetAccountNumber();
    }
    @Test
    public void testThatFindAccountCanLocateAccount(){
        Account account1 = myBank.registerCustomer("Onome", "Precious", "4455");
        Account account2 = myBank.registerCustomer("Adeleye", "Precious", "1234");
        Account account3 = myBank.registerCustomer("Adeleye", "Toheeb", "9876");

        assertEquals(account3, myBank.findAccount(1003));
        account2.resetAccountNumber();
    }

    @Test
    public void testThatRemoveAccountCanRemoveAccount(){
        Account account1 = myBank.registerCustomer("Onome", "Precious", "4455");
        Account account2 = myBank.registerCustomer("Adeleye", "Precious", "1234");
        Account account3 = myBank.registerCustomer("Adeleye", "Toheeb", "9876");

        myBank.removeAccount(1003, "9876");

        assertNotEquals(account3, myBank.findAccount(1003));
        account2.resetAccountNumber();
    }

    @Test
    public void testThatPositiveAmountCanBeDepositedInTheAccount() throws InvalidAmountException {
        Account account1 = myBank.registerCustomer("Onome", "Precious", "4455");
        myBank.deposit(1001, 3000);
        assertEquals(3000, myBank.checkBalance(1005, "4455"));

    }
}
