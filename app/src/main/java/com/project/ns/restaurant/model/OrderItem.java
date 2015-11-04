package com.project.ns.restaurant.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nats on 2015-11-02.
 */
public class OrderItem {

    private long id;
    private int quantity = 1;
    private Order order;
    private Dish dish;
    private ArrayList<SideDish> sideDishes = new ArrayList<SideDish>();

    private String status = "CREATED";

    private int version = 1;

    public void setId(long value) {
        this.id = value;
    }

    public long getId() {
        return id;
    }

    public void setQuantity(int value) {
        this.quantity = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSideDishes(ArrayList<SideDish> value) {
        this.sideDishes = value;
    }

    public ArrayList<SideDish> getSideDishes() {
        return sideDishes;
    }


    public void setDish(Dish value) {
        this.dish = value;
    }

    public Dish getDish() {
        return dish;
    }

    public void setOrder(Order value) {
        this.order = value;
    }

    public Order getOrder() {
        return order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    public boolean equals(Object aObj) {
        if (aObj == this)
            return true;
        if (!(aObj instanceof OrderItem))
            return false;
        OrderItem orderitem = (OrderItem)aObj;
        if (getId() != orderitem.getId())
            return false;
        if (getOrder() == null) {
            if (orderitem.getOrder() != null)
                return false;
        }
        else if (!getOrder().equals(orderitem.getOrder()))
            return false;
        if (getDish() == null) {
            if (orderitem.getDish() != null)
                return false;
        }
        else if (!getDish().equals(orderitem.getDish()))
            return false;
        return true;
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
