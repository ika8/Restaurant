package com.project.ns.restaurant.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nats on 2015-11-02.
 */
public class RestaurantTable {

    private long id;
    private int tableNumber;
    private String status = "UNOCCUPIED";

    private int seatsNumber = 4;
    private ArrayList<Order> orders = new ArrayList<>();
    private int version = 1;

    public void setId(long value) {
        this.id = value;
    }

    public long getId() {
        return id;
    }


    public void setTableNumber(int value) {
        this.tableNumber = value;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setStatus(String value) {
        this.status = value;
    }

    public String getStatus() {
        return status;
    }

    public void setSeatsNumber(int value) {
        this.seatsNumber = value;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setOrders(ArrayList<Order> value) {
        this.orders = value;
    }

    public ArrayList<Order> getOrders() {
        return orders;
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
