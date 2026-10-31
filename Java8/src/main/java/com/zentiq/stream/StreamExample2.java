package com.zentiq.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
	
	 public static void main(String[] args) {

	        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

	        list.stream()
	            .map(n -> n * 2) // map() transforms each element into a new value by multiplying it by 2
	            .forEach(System.out::println);
	    }

}
