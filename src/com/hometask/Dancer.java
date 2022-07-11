package com.hometask;

public class Dancer extends Person{
    private String groupName;
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    void dancing(){
        System.out.println("I dance professionally and of course this makes me unique.");

    }
}
