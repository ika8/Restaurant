package com.project.ns.restaurant.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by nats on 2015-11-02.
 */
public class Price {

    private int id;
    private BigDecimal value;
    private Date creationDate;
    private Date expirationDate;
    private String status = "ACTIVE";
    private Dish dish;
    private SideDish sideDish;
    private int version = 1;

    public void setId(int value) {
        this.id = value;
    }

    public int getId() {
        return id;
    }


    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setCreationDate(Date value) {
        this.creationDate = value;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setExpirationDate(Date value) {
        this.expirationDate = value;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public String getStatus() {
        return status;
    }

    public void setDish(Dish value) {
        this.dish = value;
    }

    public Dish getDish() {
        return dish;
    }

    public SideDish getSideDish() {
        return sideDish;
    }

    public void setSideDish(SideDish sideDish) {
        this.sideDish = sideDish;
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
