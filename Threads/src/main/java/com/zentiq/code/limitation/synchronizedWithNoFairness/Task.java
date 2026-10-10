package com.zentiq.code.limitation.synchronizedWithNoFairness;

class Task {

	synchronized void print() {

		System.out.println(Thread.currentThread().getName() + " got the lock");

		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + " : " + i);

			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

		System.out.println(Thread.currentThread().getName() + " released the lock");
	}
}