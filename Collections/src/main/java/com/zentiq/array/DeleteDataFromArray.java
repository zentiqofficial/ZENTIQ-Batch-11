package com.zentiq.array;

public class DeleteDataFromArray {

	public static void main(String[] args) {

		int[] marks = { 80, 75, 90, 65 };

		// Want to delete 75
		// marks.remove(75); // ❌ Not possible

		int[] newMarks = new int[3];

		newMarks[0] = marks[0];
		newMarks[1] = marks[2];
		newMarks[2] = marks[3];

		for (int i = 0; i < newMarks.length; i++) {
			System.out.println(newMarks[i]);
		}

	}

}

//An array has a fixed size, so we cannot directly delete an element. 
//We need to create a new array and copy the required data. 
//Collections like ArrayList make it easier to remove data dynamically."

