package com.zentiq.HandledExceptionUsingTryWithResource;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExampleUsingWithOutTryWithResource {
	

	    public static void main(String[] args) {

	        FileReader file = null;

	        try {

	            file = new FileReader("test.txt");

	            int data = file.read();

	            System.out.println("File data: " + data);

	        } catch (IOException e) {

	            System.out.println("File operation failed");

	        } finally {

	            try {
	                if (file != null) {
	                    file.close();
	                }
	            } catch (IOException e) {
	                System.out.println("File closing failed");
	            }
	        }

	        System.out.println("Program completed");
	    }
	}