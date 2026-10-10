package com.zentiq.code.creatingThreadUsingRunnableInterface;


public class Task2  implements Runnable {
	public void print() {
		System.out.println("Executing Task2" +Thread.currentThread().getName());
	}
	public void run() {
		print();
	}
}