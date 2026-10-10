package com.zentiq.HandledExceptionUsingMultiCatch;

public class NullPointerExceptionHandle {

    public static void main(String[] args) {

        String name = null;

        try {

            System.out.println(name.length());

        } catch (NullPointerException | ArithmeticException e) {

            System.out.println("Exception handled");

        }

        System.out.println("Program completed");
    }
}