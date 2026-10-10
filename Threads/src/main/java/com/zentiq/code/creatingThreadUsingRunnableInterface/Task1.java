package com.zentiq.code.creatingThreadUsingRunnableInterface;

public class Task1 implements Runnable {
	public void print() {
		System.out.println("Executing Task1" +Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		print();
	}
}
