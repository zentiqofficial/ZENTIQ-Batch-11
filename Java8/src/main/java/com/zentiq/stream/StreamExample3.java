package com.zentiq.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample3 {
	
	 public static void main(String[] args) {

	        List<Integer> list = Arrays.asList(50, 20, 40, 10, 30);

	        list.stream()
	            .sorted() // sorted() sorts elements in ascending order
	            .forEach(System.out::println);
	    }
}
