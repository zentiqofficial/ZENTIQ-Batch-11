package com.zentiq.ArrayList;

import java.util.ArrayList;

public class SearchDataFromArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();

		marks.add(80);
		marks.add(75);
		marks.add(90);
		marks.add(65);

		// Want to search 90
		System.out.println(marks.contains(90));
	}
}