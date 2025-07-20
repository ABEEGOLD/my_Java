package BankAppTest;
import bankApp.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account abigailAccount = new Account();

    @Test
    public void testThatAccount_hasZeroBalance() {
        abigailAccount.getBalance();
        assertEquals(0, abigailAccount.getBalance());
    }

    @Test
    public void testDeposit() {
        assertEquals(0, abigailAccount.getBalance());
        abigailAccount.deposit(2_000);
        assertEquals(2_000, abigailAccount.getBalance());

        abigailAccount.deposit(3_000);
        assertEquals(5_000, abigailAccount.getBalance());
    }
    @Test
    public void testCanWithdraw(){
        abigailAccount.deposit(2_000);
        abigailAccount.withdraw(1_000,"correctPin");
        assertEquals(1_000, abigailAccount.getBalance());

        }

        @Test
    public void testThatAccountCannotDeposit_NegativeAmount_(){
        abigailAccount.deposit(-4_000);
        assertEquals(0, abigailAccount.getBalance());
    }

    @Test
    public void testCanWithdraw_MoreThanBalance_(){
        abigailAccount.deposit(2_000);
        assertEquals(2_000, abigailAccount.getBalance());
        abigailAccount.withdraw(5_000,"1234");
        assertEquals(2_000, abigailAccount.getBalance());
    }
    @Test
    public void testAccountCannot_withdrawNegativeAmount_(){
        abigailAccount.withdraw(-4_000,"correctPin");
        assertEquals(0, abigailAccount.getBalance());


    }
    @Test
    public void testAccountCan_multipleDeposit(){
        abigailAccount.deposit(2_000);
        abigailAccount.deposit(3_000);
        abigailAccount.deposit(4_000);
        assertEquals(9_000, abigailAccount.getBalance());

    }
    @Test
    public void testAccountCan_WithdrawWithCorrectPin(){
        abigailAccount.deposit(3_000);
    abigailAccount.withdraw(2_000,"correctPin");
    assertEquals(1_000, abigailAccount.getBalance());
    }
    @Test
    public void testAccountCanNot_WithdrawWithWrongPin(){
        abigailAccount.deposit(3_000);
        abigailAccount.withdraw(2_000,"wrong pin");
        assertEquals(3_000, abigailAccount.getBalance());
    }











}
