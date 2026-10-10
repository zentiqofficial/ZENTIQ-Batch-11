package com.zentiq.array;

public class Code5WithArrayFixedSize {
	
	 public static void main(String[] args) {

	        int[] marks = new int[3];

	        marks[0] = 80;
	        marks[1] = 75;
	        marks[2] = 90;

	        System.out.println(marks[0]);
	        System.out.println(marks[1]);
	        System.out.println(marks[2]);
	    }

}

//try to add 4th value -> marks[3] = 85; 
//java.lang.ArrayIndexOutOfBoundsException
//Once an array is created, its size cannot be increased or decreased. 
//Therefore, an array is called a fixed-size data structure.
