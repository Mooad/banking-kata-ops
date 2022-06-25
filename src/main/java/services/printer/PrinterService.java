package services.printer;

import kata.domain.Account;

public class PrinterService {

    public static Integer printGlobalOptions() {
        System.out.println("What operation you want to do ?");

        System.out.println("--> for deposit type 1");
        System.out.println("--> for withdrawal type 2");
        System.out.println("--> to see history type 3");
        System.out.println("--> to exit type 4");

        Integer choice = services.printing.ScannerService.scanString();
        manageMenuOptions(choice);

        return choice;
    }

    public static void manageMenuOptions(Integer choice) {
        if(choice.equals(4))
        {
            return;
        }
        if (!choice.equals(1) && !choice.equals(2) && !choice.equals(3)) {
            System.out.println("unknown choice !!! please type a known choice :) ");
        }
    }

    public static void printSimpleString(String toPrint)
    {
        System.out.println(toPrint);
    }

    public static void printAccountStatement(Account account)
    {
        System.out.println("account balance");
        System.out.println("current account amount --> -----------------" + account.getBalance()+" -------------------");
    }

    public static void printLocalHistory(Account account)
    {
        account.getHistory();
    }
}
