package com.zentiq.code.UsingAtomicClass;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws Exception {

        AtomicInteger counter = new AtomicInteger(0);

        Thread t1 = new Thread(new CounterTask(counter));
        Thread t2 = new Thread(new CounterTask(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter = " + counter.get());
    }
}