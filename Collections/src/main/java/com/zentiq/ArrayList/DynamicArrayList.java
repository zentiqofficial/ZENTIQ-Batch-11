package com.zentiq.ArrayList;

import java.util.ArrayList;

public class DynamicArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<>();

		marks.add(80);
		marks.add(75);
		marks.add(90);
		marks.add(null);
		marks.add(null);

		// ArrayList can grow dynamically
		marks.add(85);

		for (int i = 0; i < marks.size(); i++) {
			System.out.println(marks.get(i));
		}
	}
}
