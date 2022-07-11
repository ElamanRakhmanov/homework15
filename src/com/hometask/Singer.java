package com.hometask;

public class Singer extends Person{
    private String bandName;
    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    void singing(){
        System.out.println("I can sing.");

    }
    void playGuitar(){
        System.out.println("Also I can play on guitar.");

    }

}
