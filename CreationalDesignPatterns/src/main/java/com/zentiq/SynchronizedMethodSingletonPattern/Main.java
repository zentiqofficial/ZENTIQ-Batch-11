package com.zentiq.SynchronizedMethodSingletonPattern;

public class Main {

    public static void main(String[] args)
            throws InterruptedException {

        System.out.println("Main method started");

        // Two threads call getInstance() at the same time
        Thread t1 = new Thread(() -> {
            Database d1 = Database.getInstance();

            System.out.println(
                "Thread 1 hashCode : " + d1.hashCode()
            );
        });

        Thread t2 = new Thread(() -> {
            Database d2 = Database.getInstance();

            System.out.println(
                "Thread 2 hashCode : " + d2.hashCode()
            );
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Call from the main thread -> same object
        Database d3 = Database.getInstance();

        d3.query("SELECT * FROM users");

        System.out.println(
            "Main hashCode : " + d3.hashCode()
        );
    }
}