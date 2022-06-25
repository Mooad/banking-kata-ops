package kata.domain;

import enumeration.OperationType;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Account {

    private Balance amount;


    public Account(Balance amount) {
        this.amount = amount;
    }

    public void deposit(Balance amount) {
        this.addToAccount(amount);
        addOperation(amount, OperationType.DEPOSIT);
    }

    public void withdraw(Balance amount) {

    }

    private void addOperation(Balance amount, OperationType type) {
    }


    private void addToAccount(Balance amount) {
        this.amount = this.amount.add(amount);
    }

    private void checkAmountToWithDraw(Balance amount) {
        if (this.amount.isLessThan(amount)) {
            throw new IllegalArgumentException("Not enough to withdraw");
        }
    }

    public BigDecimal getBalance() {
        return amount.value();
    }

    public void getHistory() {
    }

}