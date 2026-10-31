package com.zentiq.BillPughSingleton;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main method started");

        // Three threads call getInstance() at the same time
        Thread t1 = new Thread(() -> {
            Database d1 = Database.getInstance();
            System.out.println("Thread 1 hashCode: " + d1.hashCode());
        });

        Thread t2 = new Thread(() -> {
            Database d2 = Database.getInstance();
            System.out.println("Thread 2 hashCode: " + d2.hashCode());
        });

        Thread t3 = new Thread(() -> {
            Database d3 = Database.getInstance();
            System.out.println("Thread 3 hashCode: " + d3.hashCode());
        });

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();

        // Main thread gets the same object
        Database d4 = Database.getInstance();

        d4.query("SELECT * FROM users");

        System.out.println("Main hashCode: " + d4.hashCode());
    }
}
