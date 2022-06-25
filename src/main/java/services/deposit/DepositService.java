package services.deposit;

import kata.domain.Account;
import kata.domain.Balance;
import services.consts.Constants;
import services.printer.PrinterService;
import services.printing.ScannerService;

import java.io.IOException;
import java.math.BigDecimal;


public class DepositService implements Deposit {

    public void depositAmountToAccount(Account account) throws IOException {
        System.out.println(Constants.AMOUNT_TO_DEPOSIT_QUESTION);
        BigDecimal inputAmount = ScannerService.scanBigDecimal();
        Balance balance = new Balance(inputAmount);
        account.deposit(balance);
        System.out.println("You have added the amount " + inputAmount + " to your account");
        PrinterService.printAccountStatement(account);
    }

}
