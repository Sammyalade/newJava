package packageChapterThree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositNegativeBalance_balanceRemainTheSameTest(){
        Account chibuzorAccount = new Account();
        assertEquals(0, chibuzorAccount.getBalance());

        chibuzorAccount.deposit(-50_000);
        assertEquals(0, chibuzorAccount.getBalance());
    }

    @Test
    public void depositPositiveAmount_balanceIncreasesTest(){
        Account chibuzorAccount = new Account();
        assertEquals(0, chibuzorAccount.getBalance());

        chibuzorAccount.deposit(2_000);
        assertEquals(2_000, chibuzorAccount.getBalance());
    }

    @Test
    public void depositPositiveAmountTwice_balanceIncreasesTest(){
        Account chibuzorAccount = new Account();
        assertEquals(0, chibuzorAccount.getBalance());

        chibuzorAccount.deposit(2_000);
        chibuzorAccount.deposit(4_000);
        assertEquals(6_000, chibuzorAccount.getBalance());
    }

    @Test
    public void withdrawNegativeAmount_balanceRemainsUnchanged(){
        Account chibuzorAccount = new Account();
        assertEquals(0, chibuzorAccount.getBalance());

        chibuzorAccount.withdraw(-20_000);
        assertEquals(0, chibuzorAccount.getBalance());
    }
    @Test
    public void withdrawPositiveAmount_balanceReduces(){
        Account chibuzorAccount = new Account();
        assertEquals(0, chibuzorAccount.getBalance());

        chibuzorAccount.deposit(1_200);
        chibuzorAccount.withdraw(1_000);
        assertEquals(200, chibuzorAccount.getBalance());
    }

    @Test
    public void withdrawPositiveAmountGreaterThanBalance_balanceRemainUnchanged(){
        Account chibuzorAccount = new Account();
        assertEquals(0, chibuzorAccount.getBalance());

        chibuzorAccount.deposit(25_000);
        chibuzorAccount.withdraw(50_000);
        assertEquals(25_000, chibuzorAccount.getBalance());
    }
}
