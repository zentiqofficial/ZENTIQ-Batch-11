package com.zentiq.code.UsingJoinMethod;

public class OddTask implements Runnable {

	Object lock;

	OddTask(Object lock) {
		this.lock = lock;
	}

	public void run() {

		synchronized (lock) {

			try {
				System.out.println("Odd Thread is waiting");

				lock.wait();

				System.out.println("Odd Thread is awake");

				for (int i = 1; i <= 10; i += 2) {
					System.out.println("Odd : " + i);
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
