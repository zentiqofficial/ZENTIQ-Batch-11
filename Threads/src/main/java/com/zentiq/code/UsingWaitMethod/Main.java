package com.zentiq.code.UsingWaitMethod;

class Main {
	public static void main(String[] args) throws Exception {

		EvenTask evenTask = new EvenTask();
		OddTask oddTask = new OddTask();

		Thread even = new Thread(evenTask, "Even-Thread");
		Thread odd = new Thread(oddTask, "Odd-Thread");

		even.start();
		odd.start();

		Thread.sleep(2000);

		synchronized (evenTask) {
			System.out.println("Main Thread is notifying evenTaskOnly");

			evenTask.notify();
			//oddTask.notify();
			
		}
	}
}
