package com.zentiq.EagerLoadingSingletonDesignPattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("Main method started");

        // First call -> returns the existing object
        Database d1 = Database.getInstance();

        // Second call -> returns the same object
        Database d2 = Database.getInstance();

        d1.query("SELECT * FROM users");
        d2.query("SELECT * FROM orders");

        // Compare object references
        System.out.println("d1 == d2 : " + (d1 == d2));

        // Compare hash codes
        System.out.println("d1 hashCode : " + d1.hashCode());
        System.out.println("d2 hashCode : " + d2.hashCode());

        // Database d3 = new Database();
        // Compile-time error because the constructor is private
    }
}
