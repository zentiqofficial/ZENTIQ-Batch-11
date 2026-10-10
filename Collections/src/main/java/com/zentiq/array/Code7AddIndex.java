package com.zentiq.array;

public class Code7AddIndex {
	
	 public static void main(String[] args) {

	        int[] marks = {80, 75, 90};

	        int[] newMarks = new int[4];

	        for (int i = 0; i < marks.length; i++) {
	            newMarks[i] = marks[i];
	        }

	        newMarks[3] = 85;

	        for (int i = 0; i < newMarks.length; i++) {
	            System.out.println(newMarks[i]);
	        }
	    }
}

//An array has a fixed size, so we cannot directly add new data when the array is full. 
//We need to create a new array and copy the old data. 
//Collections like ArrayList make it easier to add and remove data dynamically.

