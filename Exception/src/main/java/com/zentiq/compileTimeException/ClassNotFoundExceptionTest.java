package com.zentiq.compileTimeException;

public class ClassNotFoundExceptionTest {
	
	public static void main(String[] args) throws ClassNotFoundException {

			Class.forName("com.example.Test");

			System.out.println("Class not found");
		}
}

//ClassNotFoundException is a checked exception.
//The compiler checks it at compile time.
//We must either handle it using try-catch
//or declare it using throws.