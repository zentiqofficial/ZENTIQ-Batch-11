package com.zentiq.code.UsingJoinMethod;

public class Main {

	public static void main(String[] args) throws Exception {

		Object lock = new Object();

		Thread even = new Thread(new EvenTask(lock), "Even-Thread");
		Thread odd = new Thread(new OddTask(lock), "Odd-Thread");

		even.start();
		odd.start();

		Thread.sleep(2000);

		synchronized (lock) {

			System.out.println("Main Thread is notifying");

			lock.notify();
			// lock.notifyAll();
		}
	}
}