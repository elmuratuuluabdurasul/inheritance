package com.company;

public class Main {
    public static void main(String[] args) {

        Dancer dancer = new Dancer("Asel", 20, "Kyz-Burak");

        System.out.println(dancer);
        System.out.println(dancer.getGroupName());
        System.out.println(dancer.join());
        dancer.dancing();
        System.out.println();


        Programmer programmer = new Programmer("Abdurasul", 23, "Peaksoft");

        System.out.println(programmer);
        System.out.println(programmer.getCompanyName());
        System.out.println(programmer.join());
        programmer.coding();
        System.out.println();

        Singer singer = new Singer("Maksat", 31, "NonStop" );

        System.out.println(singer);
        System.out.println(singer.getBandName());
        System.out.println(singer.join());
        singer.singing();
        singer.playGitar();


    }
}