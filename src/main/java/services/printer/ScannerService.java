package services.printing;

import lombok.Synchronized;

import java.math.BigDecimal;
import java.util.Scanner;

public class ScannerService {

    public static Scanner scanner = new Scanner(System.in);

    @Synchronized
    public static Integer scanString() {

        Integer in = scanner.nextInt();
        return in;
    }

    public static BigDecimal scanBigDecimal() {
        return scanner.nextBigDecimal();
    }
}
