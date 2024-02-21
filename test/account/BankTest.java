package account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankTest {

    Bank guarantyTrustBank;

    @BeforeEach
    public void initializeBank(){
        guarantyTrustBank = new Bank();
    }
    @Test
    public void registerOneAccount_numberOfAccountIsOneTest(){
        assertEquals(0, guarantyTrustBank.countNumberOfUser());
        guarantyTrustBank.register("firstName", "lastName", "correctPin");
        assertEquals(1, guarantyTrustBank.countNumberOfUser());
    }

    @Test
    public void registerAccountAndGenerateAccountNumber_returnAccountObject(){
        assertEquals(0, guarantyTrustBank.countNumberOfUser());
        Account myAccount = guarantyTrustBank.register("firstName", "lastName", "correctPin");
        assertTrue(myAccount instanceof Account);
    }

    @Test
    public void generateAccountNumberInTheBank_displayAccountNumberTest(){
        Account myAccount = guarantyTrustBank.register("firstName", "lastName", "correctPin");
        assertEquals(1001, myAccount.getNumber());
    }

    @Test
    public void deposit3kInTheAccountFromTheBank_balanceIs3kTest(){
        Account myAccount = guarantyTrustBank.register("firstName", "lastName", "correctPin");
        guarantyTrustBank.deposit(3_000, 1001);
        assertEquals(3_000, myAccount.getBalance("correctPin"));
    }

    @Test
    public void deposit5kWithdraw3k_balanceIs2kTest(){
        Account myAccount = guarantyTrustBank.register("firstName", "lastName", "correctPin");
        guarantyTrustBank.deposit(5_000, 1001);
        guarantyTrustBank.withdraw(3_000, 1001, "correctPin");
        assertEquals(2_000, myAccount.getBalance("correctPin"));
    }

    @Test
    public void deposit5k_transfer2k_balanceIs3k_andReceivingAccountIs2k(){
        Account account1 = guarantyTrustBank.register("firstName", "lastName", "correctPin");
        Account account2 = guarantyTrustBank.register("firstNameSecondAccount", "lastNameSecondAccount", "correctPinSecondAccount");
        guarantyTrustBank.deposit(5_000, 1001);
        guarantyTrustBank.transfer(1001, 1002, 2_000, "correctPin");
        assertEquals(3_000, account1.getBalance("correctPin"));
        assertEquals(2_000, account2.getBalance("correctPinSecondAccount"));
    }

    @Test
    public void checkBalanceFromTheBank_balanceIsReturned(){
        Account account1 = guarantyTrustBank.register("firstName", "lastName", "correctPin");
        guarantyTrustBank.deposit(5_000, 1001);
        assertEquals(5_000, guarantyTrustBank.checkBalance(1001, "correctPin"));
    }

    @Test
    public void removeAccountFromBank_accountCannotBeFoundAnymore(){
        Account account1 = guarantyTrustBank.register("firstName", "lastName", "correctPin");
        Account account2 = guarantyTrustBank.register("firstNameSecondAccount", "lastNameSecondAccount", "correctPinSecondAccount");
        guarantyTrustBank.remove(1001, "correctPin");
        assertEquals(1, guarantyTrustBank.countNumberOfUser());

    }

    @Test
    public void findAccountThatExist_returnsAccountInformationTest(){
        Account account1 = guarantyTrustBank.register("firstName", "lastName", "correctPin");
        assertEquals(account1, guarantyTrustBank.findAccount(1001));
    }
}
