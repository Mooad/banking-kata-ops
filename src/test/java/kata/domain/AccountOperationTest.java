package kata.domain;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class AccountOperationTest {
    private Account account;

    @Before
    public void init() {
        this.account = new Account(Balance.of(new BigDecimal(100)));
    }

    @Test
    public void initAccountWithCorrectBalanceValue() {
        //Given
        //When
        BigDecimal balance = this.account.getBalance();
        //Then
        assertEquals(balance, new BigDecimal(100));
    }

    @Test
    public void withdrawWithCorrectBalanceValue() {
        //Given
        this.account.withdraw(Balance.of(new BigDecimal(40)));
        //When
        BigDecimal balance = this.account.getBalance();
        //Then
        assertEquals(balance, new BigDecimal(60));
    }


    @Test(expected = IllegalArgumentException.class)
    public void depositInvalidAmountAndGetException() {
        //When
        this.account.deposit(Balance.of(new BigDecimal(-10)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void depositNullValueAndGetException() {
        //When
        this.account.deposit(null);
    }

    @Test
    public void depositTheCorrectBalanceValue() {
        //Given
        this.account.deposit(Balance.of(new BigDecimal(50)));
        //When
        BigDecimal balance = this.account.getBalance();
        //Then
        assertEquals(balance, new BigDecimal(150));
    }


    @Test(expected = IllegalArgumentException.class)
    public void withdrawInvalidAmountAndGetException() {
        //When
        this.account.withdraw(Balance.of(new BigDecimal(-10)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullWithrawWillThrowException() {
        //When
        this.account.withdraw(null);
    }


    @Test
    public void printHistoryOfOperations() {
        this.account.deposit(Balance.of(new BigDecimal(100)));
        this.account.withdraw(Balance.of(new BigDecimal(30)));

        this.account.getHistory();
    }
}
