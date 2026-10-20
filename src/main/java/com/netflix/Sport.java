package com.netflix;

public class Sport {
    String name;
    int yearsPracticed;

    public void info() {
        System.out.println(name + yearsPracticed);
    }

    public static void GenericInfo() {
        System.out.println("There are 100 of types of different sports");
    }
}
