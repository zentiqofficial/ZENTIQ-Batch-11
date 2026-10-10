package com.zentiq.code.creatingThreadUsingRunnableInterface;

public class Task3 implements Runnable {
	public void print() {
		System.out.println("Executing Task3" +Thread.currentThread().getName());
	}
	public void run() {
		print();
	}
}