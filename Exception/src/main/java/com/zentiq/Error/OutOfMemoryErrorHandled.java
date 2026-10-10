package com.zentiq.Error;

import java.util.ArrayList;

public class OutOfMemoryErrorHandled {

	public static void main(String[] args) {

		ArrayList<int[]> list = new ArrayList<>();

		try {

			while (true) {

				list.add(new int[1000000]);
			}

		} catch (OutOfMemoryError e) {

			System.out.println("OutOfMemoryError occurred!");
			System.out.println("Heap memory is full.");

		}

		System.out.println("Program completed.");
	}
}