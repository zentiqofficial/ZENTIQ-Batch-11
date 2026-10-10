package com.zentiq.code.UsingYieldMethod;

public class Main {
	public static void main(String[] args) {

		Thread odd = new Thread(new OddTask(), "Odd-Thread");
		Thread even = new Thread(new EvenTask(), "Even-Thread");

		odd.start();
		even.start();
	}
}