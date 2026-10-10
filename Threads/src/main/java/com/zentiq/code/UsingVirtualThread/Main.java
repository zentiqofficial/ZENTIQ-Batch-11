package com.zentiq.code.UsingVirtualThread;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		Thread virtualThread = Thread.startVirtualThread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
				}
			}
		});

		virtualThread.join();
	}
}