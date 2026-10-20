package com.netflix;

import java.util.Scanner;

public class Main {

    // Main Method

    // public = Access modifier -> accessible in all files outside the class
    // static = Without instantiating an object
        // With static we don't have to do Main main = new Main();
    // void = Means there is result that  the method expects back

    // Have Scanner above everything else
    static Scanner read = new Scanner(System.in); //

    public static void main(String[] args) {

        // When creating a class you must make an instantiation of it
        Sport sport1 = new Sport();
        sport1.name = "Basketball";
        sport1.yearsPracticed = 2;
        sport1.info();

        // Static information that doesn't belong to a specific type of sport
        Sport.GenericInfo();



        System.out.println("Coding is so cool!");

        System.out.print("What is your name? ");
        String name = read.nextLine();
        System.out.print("What is your age? ");
        int age = read.nextInt();
        calculateHowManyYearsLeftToWork(name, age);

        Message("Sama");
        Message("Jofre");

        // With methods, you can pass the variable inside the method parentheses
        calculateHowManyYearsLeftToWork("Ronnell", 27);
        calculateHowManyYearsLeftToWork("Thuan", 29);
        calculateHowManyYearsLeftToWork("Andres", 28);

    }

    // Make a Message() method that prints out a name
    public static void Message(String name) {
        System.out.println("Hi " + name);
    }

    public static void calculateHowManyYearsLeftToWork(String name, int age) {

        // This is a local variable
        int retirementAge = 67;

        // Calculate how many years are left
        int years = retirementAge - age;

        System.out.println(name + " You still need to work " + years + " amount of years");
    }
}
