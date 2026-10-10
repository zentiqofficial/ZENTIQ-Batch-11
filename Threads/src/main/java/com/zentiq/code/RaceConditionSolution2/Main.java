package com.zentiq.code.RaceConditionSolution2;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();

		CounterTask task1 = new CounterTask(counter);
		CounterTask task2 = new CounterTask(counter);

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Count = " + counter.count);
	}
}