package com.zentiq.code.Deadlock;

public class Task1 implements Runnable {

	Object lock1;
	Object lock2;

	Task1(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	public void run() {

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
