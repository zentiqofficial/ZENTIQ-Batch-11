package com.zentiq.code.UsingWaitMethod1;

public class Main {
	public static void main(String[] args) throws Exception {

		Thread odd = new Thread(new OddTask(), "Odd-Thread");
		Thread even = new Thread(new EvenTask(), "Even-Thread");

		odd.start();
		odd.join(); // Main waits until Odd finishes

		even.start();
		even.join(); // Main waits until Even finishes

		System.out.println("Main thread finished");
	}
}