package pl.hubers.creditcard;

import java.math.BigDecimal;

public class CreditCard {


    private BigDecimal creditLimit;

    public void assignCredit(BigDecimal creditLimit) {
        if (this.creditLimit != null){
            throw new CreditCantBeReassignedException();
        }
        if (creditLimit.compareTo(BigDecimal.valueOf(100)) < 0){
            throw new CreditBelowThresholdException();
        }
        this.creditLimit = creditLimit;
    }

    public BigDecimal getBalance() {

        return creditLimit;
    }
}
