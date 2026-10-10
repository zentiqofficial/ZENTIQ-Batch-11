package com.zentiq.HandledExceptionUsingTryCatchFinally;

public class ArrayIndexOutOfBoundsExceptionHandle {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index");

        } finally {

            System.out.println("Finally block executed");

        }

        System.out.println("Program completed");
    }
}