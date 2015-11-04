package com.project.ns.restaurant.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by nats on 2015-11-02.
 */
public class Vat {

    private int id;

    private BigDecimal value;
    private Date creationDate;
    private Date expirationDate;
    private String status;
    private Category category;
    private SideDish sideDish;
    private int version = 1;

    public void setId(int value) {
        this.id = value;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
