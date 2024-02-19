package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    private Account myAccount;
    @BeforeEach
    public void initializeAccount(){
        myAccount = new Account("Adefemi", "4455");
    }
    @Test
    public void testThatAccountIsEmpty() throws InvalidPinException {
        assertEquals(0, myAccount.checkBalance("4455"));
    }

    @Test
    public void testThatNegativeAmountCannotBeDeposited(){
       assertThrows(InvalidAmountException.class, () ->  myAccount.deposit(-1000));
    }

    @Test
    public void testThatPositiveAmountCanBeDeposited() throws InvalidAmountException, InvalidPinException {
        myAccount.deposit(10_000);
        assertEquals(10_000, myAccount.checkBalance("4455"));
    }

    @Test
    public void testThatPositiveAmountCanBeDepositedTwice() throws InvalidAmountException, InvalidPinException {
        myAccount.deposit(10_000);
        myAccount.deposit(20_000);
        assertEquals(30_000, myAccount.checkBalance("4455"));
    }

    @Test
    public void testThatNegativeAmountCannotBeWithdrawn() throws InvalidPinException {
        assertEquals(0, myAccount.checkBalance("4455"));
        assertThrows(InvalidAmountException.class, () -> myAccount.withdraw(-1000, "Food"));
    }

    @Test
    public void testThatAmountGreaterThanBalanceCannotBeWithdrawn() throws InvalidPinException, InvalidAmountException {
        assertEquals(0, myAccount.checkBalance("4455"));
        myAccount.deposit(10_000);
        assertThrows(InsufficientFundsException.class, () -> myAccount.withdraw(100_000, "Food"));
    }

    @Test
    public void testThatAmountCanBeWithdrawn() throws InvalidAmountException, InsufficientFundsException, InvalidPinException {
        myAccount.deposit(100_000);
        myAccount.withdraw(50_000, "Food");
        assertEquals(50_000, myAccount.checkBalance("4455"));
    }
}
