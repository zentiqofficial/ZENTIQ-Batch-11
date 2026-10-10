package com.zentiq.compileTimeException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader file = new FileReader("test.txt");
		System.out.println("File opened successfully");
		System.out.println("File not found");
		System.out.println("Program completed");
	}
}

//FileNotFoundException is a checked exception.
//The compiler checks it at compile time.
//We must either handle it using try-catch
//or declare it using throws.