package com.zentiq.code.limitation.synchronizedWithNoControl;

public class Main {

	public static void main(String[] args) {

		Task task = new Task();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				task.print();
			}
		}, "Thread-1");

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				task.print();
			}
		}, "Thread-2");

		t1.start();
		t2.start();
	}
}
