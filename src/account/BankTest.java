package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    }

    @Test
    public void testThat
}
