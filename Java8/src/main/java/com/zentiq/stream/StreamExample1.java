package com.zentiq.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample1 {

	    public static void main(String[] args) {

	        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // 1. filter() - keep elements greater than 5
	        System.out.println("filter:");
	        list.stream()
	            .filter(x -> x > 5)
	            .forEach(System.out::println); // 6 7 8 9 10

	        // 2. map() - double each element
	        System.out.println("map:");
	        list.stream()
	            .map(x -> x * 2)
	            .forEach(System.out::println); // 2 4 6 8 10 12 14 16 18 20

	        // 3. sorted() - sort elements
	        System.out.println("sorted:");
	        List.of(5, 3, 1, 4, 2).stream()
	            .sorted()
	            .forEach(System.out::println); // 1 2 3 4 5

	        // 4. distinct() - remove duplicates
	        System.out.println("distinct:");
	        List.of(1, 2, 2, 3, 3, 4).stream()
	            .distinct()
	            .forEach(System.out::println); // 1 2 3 4

	        // 5. limit() - limit to first 5 elements
	        System.out.println("limit:");
	        list.stream()
	            .limit(5)
	            .forEach(System.out::println); // 1 2 3 4 5

	        // 6. skip() - skip first 5 elements
	        System.out.println("skip:");
	        list.stream()
	            .skip(5)
	            .forEach(System.out::println); // 6 7 8 9 10

	        // 7. count() - count elements
	        long count = list.stream()
	            .filter(x -> x > 5)
	            .count();

	        System.out.println("count: " + count); // 5

	        // 8. findFirst() - find first matching element
	        Optional<Integer> first = list.stream()
	            .filter(x -> x > 5)
	            .findFirst();

	        System.out.println("findFirst: " + first.get()); // 6

	        // 9. min() and max()
	        Optional<Integer> min = list.stream()
	            .min(Comparator.naturalOrder());

	        Optional<Integer> max = list.stream()
	            .max(Comparator.naturalOrder());

	        System.out.println("min: " + min.get()); // 1
	        System.out.println("max: " + max.get()); // 10

	        // 10. reduce() - sum all elements
	        int sum = list.stream()
	            .reduce(0, (a, b) -> a + b);

	        System.out.println("reduce sum: " + sum); // 55

	        // 11. collect() - collect to List
	        List<Integer> result = list.stream()
	            .filter(x -> x >= 6)
	            .collect(Collectors.toList());

	        System.out.println("toList: " + result); // [6, 7, 8, 9, 10]

	        // 12. allMatch(), anyMatch(), noneMatch()
	        System.out.println("allMatch > 0: "
	            + list.stream().allMatch(x -> x > 0)); // true

	        System.out.println("anyMatch > 5: "
	            + list.stream().anyMatch(x -> x > 5)); // true

	        System.out.println("noneMatch > 10: "
	            + list.stream().noneMatch(x -> x > 10)); // true
	    }
	}
