package com.zentiq.code.limitationLockWithFair;

import java.util.concurrent.locks.ReentrantLock;

class Task {

	ReentrantLock lock = new ReentrantLock(true);

	void print() {

		lock.lock();

		try {

			System.out.println(Thread.currentThread().getName() + " got lock");

			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}

		} finally {
			lock.unlock();
		}
	}
}