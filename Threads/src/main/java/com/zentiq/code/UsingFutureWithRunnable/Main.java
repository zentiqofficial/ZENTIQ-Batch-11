package com.zentiq.code.UsingFutureWithRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception {

		ExecutorService service = Executors.newSingleThreadExecutor();

		Future<Integer> future = service.submit(new Runnable() {

			@Override
			public void run() {

				System.out.println("Task is running...");

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Task completed...");
			}

		}, 100);

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
//With Runnable, the task itself does not return a value.
//
//submit(Runnable, 100) associates the result 100 with the Future.
//
//When we call future.get(), the main thread waits until
//the task is completed. Then get() returns the result.
//
//Flow:
//
//submit()
// ↓
//Runnable task starts
// ↓
//Task sleeps for 5 seconds
// ↓
//future.get()
// ↓
//Main thread waits
// ↓
//Task completed
// ↓
//future.get() returns 100
// ↓
//Main thread continues
//
//==============================================
