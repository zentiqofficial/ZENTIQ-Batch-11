package com.zentiq.code.UsingFutureWithCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<Integer> future = service.submit(new Callable<Integer>() {

            @Override
            public Integer call() {

                System.out.println("Task is running...");

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Task completed...");

                return 100;
            }
        });

        System.out.println("Main thread is working...");

        System.out.println("Before get()");

        Integer result = future.get();

        System.out.println("After get()");

        System.out.println("Result = " + result);

        service.shutdown();
    }
}

//==================== NOTE ====================
//
//Callable is used when a task needs to return a value.
//
//call() method returns the result.
//
//submit(Callable) returns a Future.
//
//future.get() is a blocking method.
//The main thread waits until the Callable task completes.
//
//Flow:
//
//submit()
// ↓
//Callable task starts
// ↓
//Task sleeps for 5 seconds
// ↓
//future.get()
// ↓
//Main thread waits
// ↓
//Task completes and returns 100
// ↓
//future.get() returns 100
// ↓
//Main thread continues
//
//==============================================