package kata.domain;

import enumeration.AmountOperator;
import java.math.BigDecimal;
import java.util.Objects;

public final class Balance {

    private final BigDecimal currentAmount;

    public Balance(BigDecimal amount) {
        if (amount == null || amount.doubleValue() < 0)
            throw new IllegalArgumentException("Invalid value");
        this.currentAmount = amount;
    }

    public static Balance of(BigDecimal value) {
        return new Balance(value);
    }

    public BigDecimal value(){
        return this.currentAmount;
    }

    private  Balance operate(Balance amount, AmountOperator operator) {
        if (amount == null || operator == null) throw new IllegalArgumentException("Not null please");
        switch (operator) {
            case ADD:
                return new Balance(this.value().add(amount.value()));
            case SUBTRACT:
                return new Balance(this.value().subtract(amount.value()));
        }
        return this;
    }

    public Balance add(Balance amountToAdd) {
        return this.operate(amountToAdd, AmountOperator.ADD);
    }

    public Balance subtract(Balance amountToSub) {
        return this.operate(amountToSub, AmountOperator.SUBTRACT);
    }

    public boolean isLessThan(Balance amount) {
        return this.compare(amount) < 0;
    }

    private int compare(Balance amount) {
        if (amount == null) throw new IllegalArgumentException("Not null please");
        return this.value().compareTo(amount.value());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Balance amount1 = (Balance) o;
        return currentAmount.compareTo(amount1.value()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentAmount);
    }
}
