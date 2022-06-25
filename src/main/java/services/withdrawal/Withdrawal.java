package services.withdrawal;

import kata.domain.Account;

import java.io.IOException;

public interface Withdrawal {

    public void withdrawalAmountFromAccount(Account account) throws IOException;

}
