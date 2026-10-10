package com.zentiq.code.UsingRunnableInterface;

//Use Runnable when you want a thread to perform some task, but you don't need it to return a result.
class MyTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Task is running");

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}
