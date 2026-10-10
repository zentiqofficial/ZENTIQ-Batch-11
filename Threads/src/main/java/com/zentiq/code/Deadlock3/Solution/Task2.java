package com.zentiq.code.Deadlock3.Solution;

//Solution - I will prevent deadlock by acquiring multiple locks in the same order in all threads.
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

				synchronized (lock1) { // Lock1 first

					System.out.println("Task2 got Lock1");

					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}

					synchronized (lock2) { // Lock2 second

						System.out.println("Task2 got Lock2");
					}
				}
			}
		}
	}
}