package com.zentiq.code.lifeCycle;

public class Main {

	static Object lock = new Object();

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("Inside run() : " + Thread.currentThread().getState());

				// ==============================
				// TIMED_WAITING
				// ==============================

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("After sleep : " + Thread.currentThread().getState());
			}
		}, "Thread-1");

		// ==========================================
		// NEW
		// ==========================================

		System.out.println("1. Thread created : " + t1.getState());

		// ==========================================
		// Start thread
		// ==========================================

		t1.start();

		System.out.println("2. After start() : " + t1.getState());

		// ==========================================
		// Give thread time to enter sleep()
		// ==========================================

		Thread.sleep(500);

		System.out.println("3. During sleep : " + t1.getState());

		// ==========================================
		// join()
		// Main waits for Thread-1
		// ==========================================

		t1.join();

		System.out.println("4. After completion : " + t1.getState());
	}
}