package com.zentiq.code.creatingThreadUsingThreadClass;

public class Task3 extends Thread {
	public void print() {
		System.out.println("Executing Task3" +Thread.currentThread().getName());
	}
	public void run() {
		print();
	}
}