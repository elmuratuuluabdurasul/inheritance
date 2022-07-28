package com.company;

public class Programmer extends Person {

    private String  companyName;

    public Programmer(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return "kompaniamdyn aty " + companyName;
    }

    public void coding(){
        System.out.println("I am coding");
    }
}
