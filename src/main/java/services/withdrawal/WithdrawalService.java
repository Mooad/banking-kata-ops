package services.withdrawal;

import kata.domain.Account;
import kata.domain.Balance;
import services.consts.Constants;
import services.printer.PrinterService;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class WithdrawalService {

    public void withdrawalAmountFromAccount(Account account) throws IOException {
        Scanner scanner = new Scanner(System.in);

        PrinterService.printSimpleString(Constants.AMOUNT_TO_WITHRAW_QUESTION);
        BigDecimal inputAmount = scanner.nextBigDecimal();
        Balance balance = new Balance(inputAmount);
        account.withdraw(balance);
        PrinterService.printAccountStatement(account);


        account.toString();
    }
}
