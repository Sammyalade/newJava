package account;

import account.exception.InsufficientFundsException;
import account.exception.InvalidAmountException;
import account.exception.InvalidPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    private Account myAccount;
    @BeforeEach
    public void initializeAccount(){
        myAccount = new Account("correctPin");
    }

    @Test
    public void deposit3kIntoTheAccount_balanceIs3kWhenPinIsCorrectTest(){
        myAccount.deposit(3_000);
        assertEquals(3_000, myAccount.getBalance("correctPin"));
    }

    @Test
    public void deposit3kTwice_getBalanceWhenPinIsCorrect_balanceIs6kTest(){
        myAccount.deposit(3_000);
        myAccount.deposit(3_000);
        assertEquals(6_000, myAccount.getBalance("correctPin"));
    }

    @Test
    public void depositNegativeAmount_throwsInvalidAmountException(){
        assertThrows(InvalidAmountException.class, () -> myAccount.deposit(-3_000));
    }

    @Test
    public void getBalanceWhenPinIsIncorrect_throwsInvalidPinException(){
        assertThrows(InvalidPinException.class, () -> myAccount.getBalance("incorrectPin"));
    }

    @Test
    public void deposit3k_Withdraw2kWhenPinIsCorrect_balanceIs1kTest(){
        myAccount.deposit(3_000);
        myAccount.withdraw(2_000, "correctPin");
        assertEquals(1_000, myAccount.getBalance("correctPin"));
    }

    @Test
    public void deposit2k_withdraw10kWhenPinIsCorrect_throwsInsufficientFundsEXception(){
        myAccount.deposit(2_000);
        assertThrows(InsufficientFundsException.class, () -> myAccount.withdraw(10_000, "correctPin"));
    }

    @Test
    public void deposit5k_withdraw3kWhenPinIsIncorrect_throwsInvalidPinException(){
        myAccount.deposit(5_000);
        assertThrows(InvalidPinException.class, ()-> myAccount.withdraw(3_000, "incorrectPin"));
    }

    @Test
    public void withdrawNegativeBalanceWhenPinIsCorrect_throwsInvalidAmountException(){
        assertThrows(InvalidAmountException.class,() -> myAccount.withdraw(-3_000, "correctPin"));
    }

}
