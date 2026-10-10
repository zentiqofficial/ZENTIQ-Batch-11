package com.zentiq.code.UsingDaemonThread;

public class Main {

	public static void main(String[] args) throws Exception {

		MyTask t = new MyTask();

		t.setDaemon(true); // Daemon thread
		t.start();

		System.out.println("Main thread is running");

		Thread.sleep(3000);

		System.out.println("Main thread is finished");
	}
}