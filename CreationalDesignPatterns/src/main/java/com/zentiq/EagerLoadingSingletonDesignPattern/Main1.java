package com.zentiq.EagerLoadingSingletonDesignPattern;


public class Main1 {

    public static void main(String[] args) {

        System.out.println("Main method started");

        Database1 d1 = Database1.getInstance();

        Database1 d2 = Database1.getInstance();

        d1.query("SELECT * FROM users");
        d2.query("SELECT * FROM orders");

        System.out.println("d1 == d2 : " + (d1 == d2));

        System.out.println("d1 hashCode : " + d1.hashCode());
        System.out.println("d2 hashCode : " + d2.hashCode());
    }
}
