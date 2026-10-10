package com.zentiq.code.UsingSleepMethod2;

public class Main {

	public static void main(String[] args) {

		Thread even = new Thread(new EvenTask(), "Even-Thread");
		Thread odd = new Thread(new OddTask(), "Odd-Thread");

		even.start();
		odd.start();
	}
}
