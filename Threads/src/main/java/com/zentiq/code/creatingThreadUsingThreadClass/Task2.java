package com.zentiq.code.creatingThreadUsingThreadClass;

public class Task2  extends Thread {
	public void print() {
		System.out.println("Executing Task2" +Thread.currentThread().getName());
	}
	public void run() {
		print();
	}
}