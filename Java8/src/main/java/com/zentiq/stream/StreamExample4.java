package com.zentiq.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample4 {

		 public static void main(String[] args) {

		        List<Integer> list = Arrays.asList(10, 20, 10, 30, 20, 40, 50);

		        list.stream()
		            .distinct() // distinct() removes duplicate elements from the stream
		            .forEach(System.out::println);
		    }
}
