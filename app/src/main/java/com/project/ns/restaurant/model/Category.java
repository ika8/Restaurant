package com.project.ns.restaurant.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nats on 2015-11-02.
 */
public class Category {

    private long id;
    private String name;
    public ArrayList<Dish> dishes = new ArrayList<>();
    public ArrayList<Vat> vats = new ArrayList<>();
    private BigDecimal actualVatValue = new BigDecimal("0");
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

    public void setActualVatValue(BigDecimal value) {
        this.actualVatValue = value;
    }

    public BigDecimal getActualVatValue() {
        if(actualVatValue.equals(new BigDecimal(0)) && !vats.isEmpty()){
            for(Vat vat : vats){
                if(vat.getStatus() == "ACTIVE"){
                    actualVatValue = vat.getValue();
                }
            }
        }
        return actualVatValue;
    }

    public void setDishes(ArrayList<Dish> value) {
        this.dishes = value;
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public ArrayList<Vat> getVats() {
        return vats;
    }

    public void setVats(ArrayList<Vat> vats) {
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
