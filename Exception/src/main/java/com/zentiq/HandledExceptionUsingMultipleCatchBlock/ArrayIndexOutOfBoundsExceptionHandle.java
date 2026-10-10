package com.zentiq.HandledExceptionUsingMultipleCatchBlock;

public class ArrayIndexOutOfBoundsExceptionHandle {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index");

        } catch (NullPointerException e) {

            System.out.println("Object is null");

        } catch (Exception e) {

            System.out.println("Exception handled");

        }

        System.out.println("Program completed");
    }
}