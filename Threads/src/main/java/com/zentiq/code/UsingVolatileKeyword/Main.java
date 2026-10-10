package com.zentiq.code.UsingVolatileKeyword;

//volatile ensures that changes made by one thread to a variable are visible to other threads.

public class Main {

	static volatile boolean running = true;

	public static void main(String[] args) throws InterruptedException {

		Thread worker = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("Worker started");

				while (running) {
					// Worker is working
				}

				System.out.println("Worker stopped");
			}
		});

		worker.start();

		Thread.sleep(2000);

		System.out.println("Main: Stopping worker");

		running = false;

		worker.join();

		System.out.println("Main: Worker has stopped");
	}
}