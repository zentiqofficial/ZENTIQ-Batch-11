package com.zentiq.code.creatingThreadUsingRunnableInterface;

public class Main {
	public static void main(String as[]) {

		Task1 task1 = new Task1();
		Task1 task2 = new Task1();
		Task1 task3 = new Task1();

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		Thread t3 = new Thread(task3);

		t1.start();
		t2.start();
		t3.start();

	}
}