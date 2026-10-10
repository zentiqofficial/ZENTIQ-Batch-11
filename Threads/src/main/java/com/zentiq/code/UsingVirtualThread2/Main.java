package com.zentiq.code.UsingVirtualThread2;

public class Main {

	static int sum = 0;

	public static void main(String[] args) throws Exception {

		Thread[] threads = new Thread[8];

		for (int i = 1; i <= 8; i++) {

			final int number = i;

			threads[i - 1] = Thread.startVirtualThread(new Runnable() {

				@Override
				public void run() {

					System.out.println("Thread: " + Thread.currentThread() + " Number: " + number);

					synchronized (Main.class) {
						sum = sum + number;
					}
				}
			});
		}

		// Wait for all virtual threads
		for (Thread thread : threads) {
			thread.join();
		}

		System.out.println("Sum = " + sum);
	}
}