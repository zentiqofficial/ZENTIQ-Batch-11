package com.zentiq.code.UsingSleepMethod;

public class Main {
	public static void main(String as[]) {
		Thread th = Thread.currentThread();
		System.out.println(th);
		System.out.println("-------------------");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread Name: " + th.getName() + ", Thread ID: " + i);
			try {
				Thread.sleep(7000);
			} catch (Exception ex) {
				System.out.println(ex);
			}
		}
	
	}

}
