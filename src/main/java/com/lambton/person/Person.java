package com.lambton.person;

import com.lambton.IDisplay;

public class Person implements IDisplay {
    protected int id;
    protected String name;
    protected String gender;

    public Person(){}

    public Person(int id, String name, String gender){
        this.id = id;
        this.name = name;
        this.gender = gender;

       // CODE = 200;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void display(){
        System.out.println("I'm a student");
    }
}
