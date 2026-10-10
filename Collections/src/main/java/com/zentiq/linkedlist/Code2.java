package com.zentiq.linkedlist;

import java.util.LinkedList;

public class Code2 {
	
	public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Add at beginning
        list.addFirst("Anil");

        // Add at end
        list.addLast("Rahul");

        System.out.println(list);
        // [Anil, Rahul]

        // Get first element
        System.out.println("First: " + list.getFirst());
        // First: Anil

        // Get last element
        System.out.println("Last: " + list.getLast());
        // Last: Rahul

        // Remove first element
        list.removeFirst();

        System.out.println(list);
        // [Rahul]

        // Remove last element
        list.removeLast();

        System.out.println(list);
        // []

        // Add at end using offer()
        list.offer("Rohit");

        System.out.println(list);
        // [Rohit]

        // Remove from beginning using poll()
        System.out.println("Removed: " + list.poll());
        // Removed: Rohit

        // Peek first element
        System.out.println("First element: " + list.peek());
        // null because list is empty
    }

}
