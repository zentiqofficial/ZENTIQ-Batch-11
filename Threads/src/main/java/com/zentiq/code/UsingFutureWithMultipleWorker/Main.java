package com.zentiq.code.UsingFutureWithMultipleWorker;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception {

		// Creates 3 worker threads
		ExecutorService service = Executors.newFixedThreadPool(3);

		Callable<Integer> task = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {

				System.out.println("Task is running by: " + Thread.currentThread().getName());

				Thread.sleep(5000);

				System.out.println("Task completed by: " + Thread.currentThread().getName());

				return 100;
			}
		};

		// Submit 3 tasks
		Future<Integer> future1 = service.submit(task);
		Future<Integer> future2 = service.submit(task);
		Future<Integer> future3 = service.submit(task);

		System.out.println("Main thread is working...");

		System.out.println("Before get()");

		// Get results
		Integer result1 = future1.get();
		Integer result2 = future2.get();
		Integer result3 = future3.get();

		System.out.println("After get()");

		System.out.println("Result 1 = " + result1);
		System.out.println("Result 2 = " + result2);
		System.out.println("Result 3 = " + result3);

		service.shutdown();
	}
}

//==================== FLOW ====================
//
//FixedThreadPool(3)
//     ↓
//Creates 3 worker threads
//     ↓
//Task 1 → Thread-1
//Task 2 → Thread-2
//Task 3 → Thread-3
//     ↓
//All 3 tasks run approximately at the same time
//     ↓
//Each task sleeps for 5 seconds
//     ↓
//Each task returns 100
//     ↓
//future1.get()
//future2.get()
//future3.get()
//     ↓
//Main thread waits for each result
//
//==============================================