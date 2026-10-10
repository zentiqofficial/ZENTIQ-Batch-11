package com.zentiq.code.UsingThreadPriority;

public class Main {
    public static void main(String[] args) {

        Thread odd = new Thread(new OddTask(), "Odd-Thread");
        Thread even = new Thread(new EvenTask(), "Even-Thread");

        odd.setPriority(Thread.MAX_PRIORITY);   // 10
        even.setPriority(Thread.MIN_PRIORITY); // 1

        odd.start();
        even.start();
    }
}