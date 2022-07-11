package com.hometask;

public class Programmer extends Person{
    private String companyName;
    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    void coding(){
        System.out.println("I'm a coder. I'll earn a lot of money and I'm gonna be a billionaire.");

    }
}
