package com.project.ns.restaurant.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by nats on 2015-11-02.
 */
public class Payment {

    private long id;
    private BigDecimal totalAmount = BigDecimal.valueOf(0.0);
    private Date creationDate = new Date();
    private Order order;
    private DailyReport dailyReport;

    private String status = "OPENED";
    private int version = 1;


    public void setId(long value) {
        this.id = value;
    }

    public long getId() {
        return id;
    }

    public void setTotalAmount(java.math.BigDecimal value) {
        this.totalAmount = value;
    }

    public java.math.BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setCreationDate(java.util.Date value) {
        this.creationDate = value;
    }

    public java.util.Date getCreationDate() {
        return creationDate;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public String getStatus() {
        return status;
    }

    public void setOrder(Order value) {
        this.order = value;
    }

    public Order getOrder() {
        return order;
    }

    public void setDailyReport(DailyReport value) {
        this.dailyReport = value;
    }

    public DailyReport getDailyReport() {
        return dailyReport;
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
