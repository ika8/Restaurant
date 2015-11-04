package com.project.ns.restaurant.model;

/**
 * Created by nats on 2015-11-02.
 */
public class CreditCard {
    private String type = "VISA";
    private String expirationMonth;
    private String expirationYear;

    public void setType(String value) {
        this.type = value;
    }

    public String getType() {
        return type;
    }

    public void setExpirationMonth(String value) {
        this.expirationMonth = value;
    }

    public String getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationYear(String value) {
        this.expirationYear = value;
    }

    public String getExpirationYear() {
        return expirationYear;
    }
}
