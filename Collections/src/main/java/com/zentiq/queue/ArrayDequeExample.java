package com.zentiq.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	    public static void main(String[] args) {

	        ArrayDeque<Integer> deque = new ArrayDeque<>();

	        // Add elements at the end
	        deque.add(10);
	        deque.add(20);
	        deque.add(30);

	        System.out.println("Deque: " + deque);

	        // Add element at the beginning
	        deque.addFirst(5);

	        System.out.println("After addFirst: " + deque);

	        // Add element at the end
	        deque.addLast(40);

	        System.out.println("After addLast: " + deque);

	        // Remove first element
	        deque.removeFirst();

	        System.out.println("After removeFirst: " + deque);

	        // Remove last element
	        deque.removeLast();

	        System.out.println("After removeLast: " + deque);

	        // Get first element
	        System.out.println("First: " + deque.getFirst());

	        // Get last element
	        System.out.println("Last: " + deque.getLast());

	        // Check element
	        System.out.println("Contains 20: " + deque.contains(20));

	        // Size
	        System.out.println("Size: " + deque.size());
	    }

}
