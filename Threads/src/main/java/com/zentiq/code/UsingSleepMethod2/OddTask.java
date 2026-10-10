package com.zentiq.code.UsingSleepMethod2;

public class OddTask implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			if (i % 2 != 0) {
				System.out.println("Odd: " + i + " | Thread: " + Thread.currentThread().getName());
			}

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
