package com.zentiq.methodreference;

import java.util.function.Function;

public class MethodReference1 {
	
	 static int square(int n) {
	        return n * n;
	    }

	    public static void main(String[] args) {

	        // Lambda Expression
	        Function<Integer, Integer> f1 = n -> square(n);
	        System.out.println(f1.apply(5));

	        // Method Reference
	        Function<Integer, Integer> f2 = MethodReference1::square;
	        System.out.println(f2.apply(5));
	    }

}
