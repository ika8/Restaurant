package com.project.ns.restaurant.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by nats on 2015-11-02.
 */
public class Employee {
    private long id;
    private String name;
    private String surname;
    private String login;
    private String password;
    private String status = "EMPLOYED";
    private Position position;

    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Role> roles = new ArrayList<>();

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

    public void setSurname(String value) {
        this.surname = value;
    }

    public String getSurname() {
        return surname;
    }

    public void setLogin(String value) {
        this.login = value;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPosition(Position value) {
        this.position = value;
    }

    public Position getPosition() {
        return position;
    }

    public void setOrders(ArrayList<Order> value) {
        this.orders = value;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }


    public ArrayList<Role> getRoles() {
        return roles;
    }


    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
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
