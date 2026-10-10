package com.zentiq.FailSafeVsFailFast;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteArrayList1 {

	public static void main(String[] args) throws Exception {

        CopyOnWriteArrayList<Integer> list =
                new CopyOnWriteArrayList<>();

        // add initial data
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Initial list: " + list);

        // create thread pool
        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        // Thread 1 - reading
        executor.submit(() -> {
            System.out.println("Thread 1 reading: " + list);
        });

        // Thread 2 - writing
        executor.submit(() -> {
            list.add(40);
            System.out.println("Thread 2 added 40: " + list);
        });

        // Thread 3 - reading while Thread 2 writes
        executor.submit(() -> {
            System.out.println("Thread 3 reading: " + list);
        });

        // wait for all threads to finish
        executor.shutdown();
        Thread.sleep(1000);

        System.out.println("Final list: " + list);

        // ==================
        // Compare with ArrayList
        // ==================
        System.out.println("\n--- Performance Test ---");

        int size = 100_000;

        // CopyOnWriteArrayList read time
        CopyOnWriteArrayList<Integer> cowList =
                new CopyOnWriteArrayList<>();
        for (int i = 0; i < size; i++) {
            cowList.add(i);
        }

        long startTime = System.nanoTime();
        cowList.get(size - 1); // read last element
        long endTime = System.nanoTime();
        System.out.println("CopyOnWriteArrayList read:  "
                + (endTime - startTime) + " ns ");

        // CopyOnWriteArrayList write time
        startTime = System.nanoTime();
        cowList.add(99999); // write - creates new copy
        endTime = System.nanoTime();
        System.out.println("CopyOnWriteArrayList write: "
                + (endTime - startTime) + " ns  slow");

        // ==================
        // Thread safety demo
        // ==================
        System.out.println("\n--- Thread Safety Demo ---");

        CopyOnWriteArrayList<String> safeList =
                new CopyOnWriteArrayList<>();

        ExecutorService executor2 =
                Executors.newFixedThreadPool(5);

        // 5 threads adding at same time
        for (int i = 0; i < 5; i++) {
            int threadNo = i;
            executor2.submit(() -> {
                safeList.add("Thread " + threadNo);
                System.out.println("Thread " + threadNo
                        + " added: " + safeList);
            });
        }

        executor2.shutdown();
        Thread.sleep(1000);

        System.out.println("Final safe list: " + safeList);
        System.out.println("Size: " + safeList.size()); // always 5 ✅
    }
}