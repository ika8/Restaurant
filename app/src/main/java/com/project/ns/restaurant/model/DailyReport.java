package com.project.ns.restaurant.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nats on 2015-11-02.
 */
public class DailyReport {
    private long id;
    private Date reportDate;
    private BigDecimal totalAmount;
    private ArrayList<Payment> payments = new ArrayList<>();
    private int version = 1;

    public void setId(long value) {
        this.id = value;
    }

    public long getId() {
        return id;
    }

    public void setReportDate(Date value) {
        this.reportDate = value;
    }

    public Date getReportDate() {
        return reportDate;
    }


    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setPayments(ArrayList<Payment> value) {
        this.payments = value;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void incrementVersion(){
        this.version = version+1;
    }

}
