package com.zentiq.array;

public class Code6WithArrayFixedSize {
	
	 public static void main(String[] args) {

		        int[] marks = {80, 75, 90};

		        System.out.println("Before adding:");
		        
		        for (int i = 0; i < marks.length; i++) {
		            System.out.println(marks[i]);
		        }

		        // Trying to add a new value
		        marks[3] = 85;
		    }
}

//try to add 4th value -> marks[3] = 85; 
//java.lang.ArrayIndexOutOfBoundsException
//Once an array is created, its size cannot be increased or decreased. 
//Therefore, an array is called a fixed-size data structure.
