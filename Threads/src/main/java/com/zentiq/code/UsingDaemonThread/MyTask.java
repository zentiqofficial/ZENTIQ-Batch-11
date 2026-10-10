package com.zentiq.code.UsingDaemonThread;

class MyTask extends Thread {

	public void run() {

		while (true) {
			System.out.println("Daemon thread is running...");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}