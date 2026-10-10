package com.zentiq.array;

public class SearchDataFromArray {

	public static void main(String[] args) {

		int[] marks = { 80, 75, 90, 65 };

		// Want to search 90
		int searchValue = 90;

		boolean found = false;

		for (int i = 0; i < marks.length; i++) {

			if (marks[i] == searchValue) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println(searchValue + " is found in the array.");
		} else {
			System.out.println(searchValue + " is not found in the array.");
		}
	}
}