package com.zentiq.code.UsingRunnableInterface;

public class Main {
	public static void main(String[] args) {

		MyTask task = new MyTask();

		Thread t = new Thread(task);

		t.start();
	}
}
