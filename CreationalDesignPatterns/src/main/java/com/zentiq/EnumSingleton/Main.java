package com.zentiq.EnumSingleton;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main method started");

        // Three threads access the same INSTANCE
        Thread t1 = new Thread(() -> {
            Database d1 = Database.INSTANCE;
            System.out.println("Thread 1 hashCode: " + d1.hashCode());
        });

        Thread t2 = new Thread(() -> {
            Database d2 = Database.INSTANCE;
            System.out.println("Thread 2 hashCode: " + d2.hashCode());
        });

        Thread t3 = new Thread(() -> {
            Database d3 = Database.INSTANCE;
            System.out.println("Thread 3 hashCode: " + d3.hashCode());
        });

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();

        // Access from the main thread
        Database d4 = Database.INSTANCE;

        d4.query("SELECT * FROM users");

        System.out.println("Main hashCode: " + d4.hashCode());
    }
}