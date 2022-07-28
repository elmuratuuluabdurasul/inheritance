package com.company;

public class Singer extends Person{

    private String bandName;

    public Singer(String name, int age, String bandName) {
        super(name, age);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void singing(){
        System.out.println("I am singing");
    }
    public void playGitar(){
        System.out.println("Gitar is my favourite tool");
    }
}
