package services;

import kata.domain.Account;
import services.deposit.DepositService;

import java.io.IOException;

public class AccountManagementService {

    public Integer doOperation(Integer op, Account account) throws IOException {
        switch (op) {
            case 1:
                DepositService depositService = new DepositService();
                depositService.depositAmountToAccount(account);
                break;

            default:
        }
        return op;
    }
}
