package com.zentiq.linkedlist;

import java.util.LinkedList;

public class LinkedListMethodExample {
	
	public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Add elements
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List: " + list);


        // addFirst()
        list.addFirst(10);
        System.out.println("After addFirst(10): " + list);
        // add at beginning


        // addLast()
        list.addLast(50);
        System.out.println("After addLast(50): " + list);
        // add at end


        // removeFirst()
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);
        // remove first element


        // removeLast()
        list.removeLast();
        System.out.println("After removeLast(): " + list);
        // remove last element


        // getFirst()
        System.out.println("getFirst(): " + list.getFirst());
        // get first element


        // getLast()
        System.out.println("getLast(): " + list.getLast());
        // get last element


        // peek()
        System.out.println("peek(): " + list.peek());
        // get first element without removing


        // poll()
        System.out.println("poll(): " + list.poll());
        // get and remove first element

        System.out.println("After poll(): " + list);


        // offer()
        list.offer(60);
        System.out.println("After offer(60): " + list);
        // add at end


        // push()
        list.push(5);
        System.out.println("After push(5): " + list);
        // add at beginning - Stack behavior


        // pop()
        System.out.println("pop(): " + list.pop());
        // remove from beginning - Stack behavior

        System.out.println("Final List: " + list);
    }

}
