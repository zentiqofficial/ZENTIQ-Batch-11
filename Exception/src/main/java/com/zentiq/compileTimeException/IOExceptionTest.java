package com.zentiq.compileTimeException;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionTest {

	  public static void main(String[] args) throws IOException {

	            FileReader file = new FileReader("test.txt");

	            file.read();

	            System.out.println("File operation failed");
	  
	    }
	}

//FileReader tries to open the file.
//The file may not exist, may not be accessible,
//or another I/O problem may occur.
//Therefore, FileReader can throw FileNotFoundException,
//which is a subclass of IOException.

//FileReader file = new FileReader("test.txt");

//read() reads data from the file.
//An I/O problem can occur while reading,
//so this method can throw IOException.

//file.read();
