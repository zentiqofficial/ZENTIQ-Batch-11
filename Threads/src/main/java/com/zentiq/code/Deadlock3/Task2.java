package com.zentiq.code.Deadlock3;

public class Task2 implements Runnable {

	Object lock1;
	Object lock2;

	Task2(Object lock1, Object lock2) {
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println("Task2 working : " + i);

			if (i == 4) {

				synchronized (lock2) {

					System.out.println("Task2 got Lock2");

					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}

					synchronized (lock1) {
						System.out.println("Task2 got Lock1");
					}
				}
			}
		}
	}
}