package com.zentiq.code.UsingThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {

		// Create a thread pool with 3 threads
		ExecutorService executor = Executors.newFixedThreadPool(3);
		//ExecutorService executor = Executors.newSingleThreadExecutor();
		//ExecutorService executor = Executors.newCachedThreadPool();
		
		// Submit tasks
		for (int i = 1; i <= 5; i++) {

			final int taskNumber = i;

			executor.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println("Task " + taskNumber + " is running by " + Thread.currentThread().getName());
				}
			});
		}

		// Stop accepting new tasks
		executor.shutdown();
	}
}
