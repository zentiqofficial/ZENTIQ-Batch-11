package com.zentiq.Error;

import java.util.ArrayList;

public class OutOfMemoryErrorTest {

	public static void main(String[] args) {

		ArrayList<int[]> list = new ArrayList<>();

		while (true) {
			list.add(new int[1000000]);
		}
	}
}

//Each loop creates one large array containing 10 lakh int elements.
//These arrays are stored in heap memory, and the list keeps references to them.
//Therefore, Garbage Collector cannot remove these arrays.
//Heap memory keeps getting filled, and when it becomes full,
//the JVM throws OutOfMemoryError.

