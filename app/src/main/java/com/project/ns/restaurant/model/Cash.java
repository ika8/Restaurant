package com.project.ns.restaurant.model;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by nats on 2015-11-02.
 */
public class Cash {

    private BigDecimal paidAmount = BigDecimal.valueOf(0.0);
    private BigDecimal changeAmount = BigDecimal.valueOf(0.0);
    public ArrayList<Payment> payments;

    public void setPaidAmount(BigDecimal value) {
        this.paidAmount = value;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setChangeAmount(BigDecimal value) {
        this.changeAmount = value;
    }

    public BigDecimal getChangeAmount() {
        return changeAmount;
    }

}
