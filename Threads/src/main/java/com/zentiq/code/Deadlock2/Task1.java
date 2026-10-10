package com.zentiq.code.Deadlock2;

public class Task1 implements Runnable {

	Object lock1;
	Object lock2;

	Task1(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	public void run() {

		// Work normally for some time
		for (int i = 1; i <= 5; i++) {

			System.out.println("Task1 working : " + i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

		// After 5 seconds
		synchronized (lock1) {

			System.out.println("Task1 got Lock1");

			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}

			synchronized (lock2) {

				System.out.println("Task1 got Lock2");
			}
		}
	}
}