package com.zentiq.HandledExceptionUsingTryCatch;

public class ArithmeticExceptionHandle {

	public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }

        System.out.println("Program completed");
    }
}