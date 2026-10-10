package com.zentiq.HandledExceptionUsingThrow;

public class IllegalArgumentExceptionHandler {

	    public static void main(String[] args) {

	        String password = "123";

	        try {

	            if (password.length() < 6) {
	                throw new IllegalArgumentException("Password is too short");
	            }

	            System.out.println("Valid password");

	        } catch (IllegalArgumentException e) {

	            System.out.println("Exception handled");
	            System.out.println(e.getMessage());
	        }

	        System.out.println("Program completed");
	    }
	}