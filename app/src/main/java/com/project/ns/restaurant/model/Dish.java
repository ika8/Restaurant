package com.project.ns.restaurant.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nats on 2015-11-02.
 */
public class Dish {
    private long id;
    private String name;
    private String description;
    private String status = "AVAILABLE";
    private Category category;
    private ArrayList<Price> prices = new ArrayList<>();
    private ArrayList<OrderItem> orderItems = new ArrayList<>();
    private BigDecimal actualPrice = new BigDecimal("0");
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

    public void setDescription(String value) {
        this.description = value;
    }

    public String getDescription() {
        return description;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public String getStatus() {
        return status;
    }

    public void setCategory(Category value) {
        this.category = value;
    }

    public Category getCategory() {
        return category;
    }

    public void setPrices(ArrayList<Price> value) {
        this.prices = value;
    }

    public ArrayList<Price> getPrices() {
        return prices;
    }


    public void setOrderItems(ArrayList<OrderItem> value) {
        this.orderItems = value;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
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
