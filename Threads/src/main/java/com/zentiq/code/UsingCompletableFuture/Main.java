package com.zentiq.code.UsingCompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {

		// Creates an asynchronous task
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(new Supplier<Integer>() {

			@Override
			public Integer get() {

				System.out.println("Task is running by: " + Thread.currentThread().getName());

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Task completed by: " + Thread.currentThread().getName());

				return 100;
			}
		});

		System.out.println("Main thread is working...");

		// Main thread does NOT wait here
		System.out.println("Main thread continues...");

		// Executes when the task is completed
		future.thenAccept(new Consumer<Integer>() {

			@Override
			public void accept(Integer result) {

				System.out.println("Result = " + result);
			}
		});

		System.out.println("Main thread finished.");

		// Wait only to keep the program alive until the async task completes
		future.join();
	}
}

// ============================================================
// PROBLEM WITH FUTURE
// ============================================================
//
// In Future, if we use:
//
//     future.get();
//
// get() is a BLOCKING method.
//
// The calling thread (main thread) has to WAIT until
// the task is completed and the result is available.
//
// CompletableFuture provides asynchronous result handling.
// We can use thenAccept() to process the result when
// the task is completed.
//
// ============================================================
// ============================================================
// 1. CREATE ASYNCHRONOUS TASK
// ============================================================
//
// supplyAsync() starts the task asynchronously.
//
// The task runs in another thread.
//
// Main thread does NOT wait for the task here.
//
// Supplier is used because the task needs to RETURN a value.
//
// return 100;
//        ↓
// CompletableFuture<Integer>
//
// ============================================================
// ============================================================
// 2. MAIN THREAD CONTINUES
// ============================================================
//
// The asynchronous task is running in another thread.
//
// Main thread does NOT wait for 5 seconds.
//
// It can continue doing other work.
//
// ============================================================
// ============================================================
// 3. HANDLE RESULT ASYNCHRONOUSLY
// ============================================================
//
// thenAccept() is used to process the result
// when the asynchronous task is completed.
//
// We do NOT call:
//
//     future.get();
//
// Therefore, we are not explicitly blocking the main thread
// to get the result.
//
// When the task returns 100:
//
//     return 100;
//          ↓
//     thenAccept()
//          ↓
//     result = 100
//
// ============================================================

// ============================================================
// 4. KEEP PROGRAM ALIVE
// ============================================================
//
// join() is used here only so that the main program
// does not finish before the asynchronous task completes.
//
// IMPORTANT:
//
// This is NOT being used to get the result like:
//
//     Integer result = future.get();
//
// The result is already handled by thenAccept().
//
// join() simply waits for the CompletableFuture to complete
// before the program terminates.
//
// ============================================================
