package com.zentiq.HandledExceptionUsingMultipleCatchBlock;

public class NumberFormatExceptionHandle {

    public static void main(String[] args) {

        String value = "abc";

        try {

            int number = Integer.parseInt(value);

            System.out.println(number);

        } catch (NumberFormatException e) {

            System.out.println("Invalid number");

        } catch (NullPointerException e) {

            System.out.println("Object is null");

        } catch (Exception e) {

            System.out.println("Exception handled");

        }

        System.out.println("Program completed");
    }
}