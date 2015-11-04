package com.project.ns.restaurant.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nats on 2015-11-02.
 */
public class Position {

    private long id;
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();
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


    public void setEmployees(ArrayList<Employee> value) {
        this.employees = value;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
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
