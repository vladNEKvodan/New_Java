package com.example.demo1;

import java.util.ArrayList;

public class Dog {
    private String name;
    private int age;

    private boolean has_owner;

    private String owner;

    private ArrayList<String> owners = new ArrayList<String>();

    public Dog(String name, int age, String owner, boolean has_owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        owners.add(owner);
        this.has_owner = has_owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean getHas_owner() {
        return has_owner;
    }

    public ArrayList<String> getOwners() {
        return owners;
    }

}