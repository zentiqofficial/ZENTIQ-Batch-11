package com.zentiq.HandledExceptionUsingTryCatch;

public class NumberFormatExceptionHandle {

	public static void main(String[] args) {

        String value = "abc";

        try {
            int number = Integer.parseInt(value);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }

        System.out.println("Program completed");
    }
}