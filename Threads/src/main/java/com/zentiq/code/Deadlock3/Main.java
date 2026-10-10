package com.zentiq.code.Deadlock3;

public class Main {

	public static void main(String[] args) {

		Object lock1 = new Object();
		Object lock2 = new Object();

		Thread t1 = new Thread(new Task1(lock1, lock2), "Thread-1");

		Thread t2 = new Thread(new Task2(lock1, lock2), "Thread-2");

		t1.start();
		t2.start();
	}
}