package com.zentiq.code.limitation.synchronizedWithNoControl;

public class Task {

	synchronized void print() {

		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + " : " + i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}