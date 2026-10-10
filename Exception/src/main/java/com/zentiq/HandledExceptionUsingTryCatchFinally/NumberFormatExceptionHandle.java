package com.zentiq.HandledExceptionUsingTryCatchFinally;

public class NumberFormatExceptionHandle {

    public static void main(String[] args) {

        String value = "abc";

        try {

            int number = Integer.parseInt(value);

            System.out.println(number);

        } catch (NumberFormatException e) {

            System.out.println("Invalid number");

        } finally {

            System.out.println("Finally block executed");

        }

        System.out.println("Program completed");
    }
}