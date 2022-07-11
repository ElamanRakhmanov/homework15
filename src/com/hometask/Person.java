package com.hometask;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    void learn(){

    }
    void walk(){

    }
    void eat(){

    }
    @Override
    public String toString(){
        return "Name - " + name + "Designation - " + designation;
    }
}
