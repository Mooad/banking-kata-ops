package services;

import kata.domain.Account;
import services.deposit.DepositService;
import services.withdrawal.WithdrawalService;

import java.io.IOException;

public class AccountManagementService {

    public Integer doOperation(Integer op, Account account) throws IOException {
        switch (op) {
            case 1:
                DepositService depositService = new DepositService();
                depositService.depositAmountToAccount(account);
                break;
            case 2:
                WithdrawalService withdrawalService = new WithdrawalService();
                withdrawalService.withdrawalAmountFromAccount(account);
                break;
            case 3:
                account.getHistory();
            case 4:
                break;

            default:
        }
        return op;
    }
}
