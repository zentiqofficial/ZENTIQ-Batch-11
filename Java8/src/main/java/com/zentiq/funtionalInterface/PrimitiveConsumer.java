package com.zentiq.funtionalInterface;

import java.util.function.IntConsumer;

public class PrimitiveConsumer {

	public static void main(String[] args) {

		// IntConsumer - int input, no output
		IntConsumer print = x -> System.out.println("Value: " + x);

		print.accept(10);
	}

}
