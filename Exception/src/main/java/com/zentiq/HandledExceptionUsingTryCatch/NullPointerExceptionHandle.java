package com.zentiq.HandledExceptionUsingTryCatch;

public class NullPointerExceptionHandle {

	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("Object is null");
		}

		System.out.println("Program completed");
	}
}