package com.zentiq.stack;

import java.util.Stack;

public class Code1 {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        // Add elements
        stack.push("Anil");
        stack.push("Rahul");
        stack.push("Rohit");

        System.out.println(stack);
        // [Anil, Rahul, Rohit]

        // See top element
        System.out.println("Top: " + stack.peek());
        // Top: Rohit

        // Remove top element
        System.out.println("Removed: " + stack.pop());
        // Removed: Rohit

        System.out.println(stack);
        // [Anil, Rahul]

        // Check if stack is empty
        System.out.println("Empty: " + stack.empty());
        // Empty: false

        // Search element
        System.out.println("Position of Anil: " + stack.search("Anil"));
        // Position of Anil: 2

        System.out.println("Position of Rahul: " + stack.search("Rahul"));
        // Position of Rahul: 1
    }
}
