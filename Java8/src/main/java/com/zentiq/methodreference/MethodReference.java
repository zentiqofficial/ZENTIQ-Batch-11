package com.zentiq.methodreference;

import java.util.function.Consumer;

public class MethodReference {
	
	public static void main(String[] args) {

        // Lambda Expression
        Consumer<String> c1 = name -> System.out.println(name);
        c1.accept("Zentiq");

        // Method Reference
        Consumer<String> c2 = System.out::println;
        c2.accept("Zentiq");
    }

}
