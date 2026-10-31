package com.zentiq.funtionalInterface;

import java.util.function.IntPredicate;

public class PrimitivePredicate {

	public static void main(String[] args) {

		// IntPredicate - int input, boolean output
		IntPredicate isEven = x -> x % 2 == 0;

		System.out.println(isEven.test(10));
		System.out.println(isEven.test(5));
	}
}
