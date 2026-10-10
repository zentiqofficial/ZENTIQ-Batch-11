package com.zentiq.code.creatingThreadUsingThreadClass;

public class Task1 extends Thread {
	public void print() {
		System.out.println("Executing Task1" +Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		print();
	}
}

