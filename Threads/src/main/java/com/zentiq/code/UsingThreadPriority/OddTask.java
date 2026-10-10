package com.zentiq.code.UsingThreadPriority;

public class OddTask implements Runnable {

	public void run() {
		for (int i = 1; i <= 10; i += 2) {
			System.out.println("Odd : " + i);

		}
	}
}