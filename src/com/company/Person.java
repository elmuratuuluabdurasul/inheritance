package com.company;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String learning(){
        return  name + " is learning";
    }

    public String eating(){
        return name + " is eating";
    }

    public String walking() {
        return name + " is walking";

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return  "Menin atym " + name + ". " + age + " jashtamyn";
    }
    public  String join(){
        return learning() + "\n" + eating() + "\n" + walking();
    }
}

