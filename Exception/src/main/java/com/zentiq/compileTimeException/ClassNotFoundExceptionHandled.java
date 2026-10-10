package com.zentiq.compileTimeException;

public class ClassNotFoundExceptionHandled {
	
	public static void main(String[] args) {

		try {

			Class.forName("com.example.Test");

		} catch (ClassNotFoundException e) {

			System.out.println("Class not found");
		}
	}
}