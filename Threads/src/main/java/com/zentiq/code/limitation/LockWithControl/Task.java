package com.zentiq.code.limitation.LockWithControl;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Task {

	ReentrantLock lock = new ReentrantLock();

	void print() {

		try {

			// Try to get the lock for maximum 2 seconds
			if (lock.tryLock(2, TimeUnit.SECONDS)) {

				try {

					System.out.println(Thread.currentThread().getName() + " got the lock");

					// Locked work
					for (int i = 1; i <= 5; i++) {

						System.out.println(Thread.currentThread().getName() + " : " + i);

						Thread.sleep(1000);
					}

				} finally {

					lock.unlock();

					System.out.println(Thread.currentThread().getName() + " released the lock");
				}

			} else {

				// Lock was not available even after 2 seconds
				System.out.println(Thread.currentThread().getName() + " could not get the lock");

				// Do some other work
				System.out.println(Thread.currentThread().getName() + " is doing some other work");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}