package com.zentiq.HandledExceptionUsingTryWithResource;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExampleUsingTryWithResource {
	
	 public static void main(String[] args) {

	        try (FileReader file = new FileReader("test.txt")) {

	            int data = file.read();

	            System.out.println("File data: " + data);

	        } catch (IOException e) {

	            System.out.println("File operation failed");
	        }

	        System.out.println("Program completed");
	    }
}

//try-with-resources automatically closes the resource
//after the try block is completed.
