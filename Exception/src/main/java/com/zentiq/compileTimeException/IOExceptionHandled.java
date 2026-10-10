package com.zentiq.compileTimeException;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionHandled {

	  public static void main(String[] args) {

	        try {

	            FileReader file = new FileReader("test.txt");

	            file.read();

	        } catch (IOException e) {

	            System.out.println("File operation failed");
	        }
	    }
	}
