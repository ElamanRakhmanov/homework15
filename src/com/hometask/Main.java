package com.hometask;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Elaman. ", "Programmer. ", "Company - Google.");
        Dancer dancer = new Dancer("Maks. ", "Dancer. ", "Group - Unbeatable.");
        Singer singer = new Singer("Bektur. ", "Singer. ", "Band - Ed Sheeran.");

        System.out.println("Programmer: " + programmer + programmer.getCompanyName());
        programmer.coding();
        System.out.println("\nDancer: " + dancer + dancer.getGroupName());
        dancer.dancing();
        System.out.println("\nSinger: " + singer + singer.getBandName());
        singer.singing();
        singer.playGuitar();
        
    }
}