package com.zentiq.HandledExceptionUsingMultiCatch;

public class ArrayIndexOutOfBoundsExceptionHandle {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {

            System.out.println("Exception handled");

        } catch (Exception e) {

            System.out.println("Other exception handled");

        }

        System.out.println("Program completed");
    }
}