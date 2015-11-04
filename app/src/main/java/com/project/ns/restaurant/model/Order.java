package com.project.ns.restaurant.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nats on 2015-11-02.
 */
public class Order {

    private long id;
    private Date creationDate;
    private BigDecimal grossAmount = BigDecimal.valueOf(0);
    private BigDecimal netAmount = BigDecimal.valueOf(0);

    private String status = "OPENED";
    private Employee employee;
    private RestaurantTable table;

    private ArrayList<OrderItem> orderItems = new ArrayList<>();
    private ArrayList<Payment> payments = new ArrayList<>();

    private int version = 1;

    public void setId(long value) {
        this.id = value;
    }

    public long getId() {
        return id;
    }

    public void setCreationDate(Date value) {
        this.creationDate = value;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setGrossAmount(BigDecimal value) {
        this.grossAmount = value;
    }

    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public String getStatus() {
        return status;
    }

    public void setEmployee(Employee value) {
        this.employee = value;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setTable(RestaurantTable value) {
        this.table = value;
    }

    public RestaurantTable getTable() {
        return table;
    }

    public void setOrderItems(ArrayList<OrderItem> value) {
        this.orderItems = value;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
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
