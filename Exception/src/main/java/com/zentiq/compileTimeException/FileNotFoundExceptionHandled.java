package com.zentiq.compileTimeException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionHandled {

	public static void main(String[] args) {

		try {

			FileReader file = new FileReader("test.txt");

			System.out.println("File opened successfully");

		} catch (FileNotFoundException e) {

			System.out.println("File not found");

		}

		System.out.println("Program completed");
	}
}