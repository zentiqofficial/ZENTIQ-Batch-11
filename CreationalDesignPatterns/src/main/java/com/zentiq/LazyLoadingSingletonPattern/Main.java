package com.zentiq.LazyLoadingSingletonPattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("Main method started");

        // First call -> instance is null -> object is created here
        Database1 d1 = Database1.getInstance();

        // Second call -> same object is returned
        Database1 d2 = Database1.getInstance();

        d1.query("SELECT * FROM users");
        d2.query("SELECT * FROM orders");

        // Compare references
        System.out.println("d1 == d2 : " + (d1 == d2));

        // Compare hash codes
        System.out.println("d1 hashCode : " + d1.hashCode());
        System.out.println("d2 hashCode : " + d2.hashCode());

        // Database1 d3 = new Database1();
        // Compile-time error because the constructor is private
    }
}
