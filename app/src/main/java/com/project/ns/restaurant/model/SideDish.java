package com.project.ns.restaurant.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nats on 2015-11-02.
 */
public class SideDish {

    private long id;
    private String name;
    private String status = "AVAILABLE";

    private Set<OrderItem> orderItem = new HashSet<OrderItem>();
    private Set<Price> prices = new HashSet<>();
    private BigDecimal actualPrice = new BigDecimal("0");
    private Set<Vat> vats = new HashSet<>();
    private BigDecimal actualVat = new BigDecimal("0");
    private int version = 1;

    public void setId(long value) {
        this.id = value;
    }

    public long getId() {
        return id;
    }


    public void setName(String value) {
        this.name = value;
    }

    public String getName() {
        return name;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public String getStatus() {
        return status;
    }

    public void setOrderItem(Set<OrderItem> value) {
        this.orderItem = value;
    }

    public Set<OrderItem> getOrderItem() {
        return orderItem;
    }


    public Set<Price> getPrices() {
        return prices;
    }


    public void setPrices(Set<Price> prices) {
        this.prices = prices;
    }

    public BigDecimal getActualPrice() {
        if(actualPrice.compareTo(new BigDecimal("0")) == 0 && !prices.isEmpty()){
            for(Price price : prices){
                if(price.getStatus() == "ACTIVE"){
                    actualPrice = price.getValue();
                    break;
                }
            }
        }
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    public BigDecimal getActualVatValue() {
        if(actualVat.compareTo(new BigDecimal("0")) == 0 && !vats.isEmpty()){
            for(Vat vat : vats){
                if(vat.getStatus() == "ACTIVE"){
                    actualVat = vat.getValue();
                    break;
                }
            }
        }
        return actualVat;
    }

    public void setActualVatValue(BigDecimal actualVatValue) {
        actualVat = actualVatValue;

    }


    public Set<Vat> getVats() {
        return vats;
    }

    public void setVats(Set<Vat> vats) {
        this.vats = vats;

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
