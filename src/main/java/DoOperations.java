import kata.domain.Account;
import kata.domain.Balance;
import services.AccountManagementService;
import services.printer.PrinterService;

import java.io.IOException;
import java.math.BigDecimal;

public class DoOperations {
    public static void main(String[] args) throws IOException {


        Account account = new Account(new Balance(new BigDecimal(0)));
        AccountManagementService accountManagementService = new AccountManagementService();
        // printing the options
        Integer nextOp;
        do {
            nextOp = accountManagementService.doOperation(PrinterService.printGlobalOptions(), account);
        }
        while (nextOp != 4);
    }

}
