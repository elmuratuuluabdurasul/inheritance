package com.company;

public class Dancer extends Person {

    private String groupName;

    public Dancer(String name, int age,String groupName) {
        super(name, age);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return "gruppamdyn atalyshy " + groupName;
    }

    public void dancing(){
        System.out.println("I love to dance");
    }
}

