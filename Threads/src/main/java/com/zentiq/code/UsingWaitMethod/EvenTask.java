package com.zentiq.code.UsingWaitMethod;

class EvenTask implements Runnable {

	public synchronized void run() {

		try {
			System.out.println("Even Thread is waiting");

			this.wait();

			System.out.println("Even Thread is awake");

			for (int i = 2; i <= 10; i += 2) {
				System.out.println("Even : " + i);
				Thread.sleep(500);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
