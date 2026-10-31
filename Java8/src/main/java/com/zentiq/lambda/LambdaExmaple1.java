package com.zentiq.lambda;

public class LambdaExmaple1 {
	
	 // Functional interface
    @FunctionalInterface
    interface AddNumbers {
        int add(int a, int b);
    }

    public static void main(String[] args) {

        // Without lambda - anonymous class
        AddNumbers obj1 = new AddNumbers() {
            public int add(int a, int b) {
                return a + b;
            }
        };

        System.out.println(obj1.add(5, 3)); // 8

        // With lambda
        AddNumbers obj2 = (a, b) -> a + b;

        System.out.println(obj2.add(5, 3)); // 8
    }

}
