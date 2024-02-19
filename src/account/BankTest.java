package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {

    private Bank myBank;

    @BeforeEach
    public void initializeMyBank(){
        myBank = new Bank();
    }

    @Test
    public void registerNewAccount_newAccountRegisteredTest(){
        Account myAccount = myBank.registerCustomer("Onome", "Precious", "4455");

        assertNotNull(myAccount);
    }

    @Test
    public void
}
