package com.zentiq.code.UsingThreadPriority;

public class EvenTask implements Runnable {

	public void run() {
		for (int i = 2; i <= 10; i += 2) {
			System.out.println("Even : " + i);

		}
	}
}