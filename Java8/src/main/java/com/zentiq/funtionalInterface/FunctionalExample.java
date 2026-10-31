package com.zentiq.funtionalInterface;

public class FunctionalExample {

	// Functional Interface
    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {

        // Without Lambda - Anonymous Class
        Calculator obj1 = new Calculator() {

            public int calculate(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Without Lambda: " + obj1.calculate(10, 20));


        // With Lambda
        Calculator obj2 = (a, b) -> a + b;

        System.out.println("With Lambda: " + obj2.calculate(10, 20));
    }
}
