package services.deposit;

import kata.domain.Account;

import java.io.IOException;

public interface Deposit {

    public void depositAmountToAccount(Account account) throws IOException;
}
