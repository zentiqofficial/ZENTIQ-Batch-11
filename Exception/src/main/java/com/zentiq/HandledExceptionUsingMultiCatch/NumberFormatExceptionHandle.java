package com.zentiq.HandledExceptionUsingMultiCatch;

public class NumberFormatExceptionHandle {

    public static void main(String[] args) {

        String value = "abc";

        try {

            int number = Integer.parseInt(value);

            System.out.println(number);

        } catch (NumberFormatException | NullPointerException e) {

            System.out.println("Exception handled");

        }

        System.out.println("Program completed");
    }
}