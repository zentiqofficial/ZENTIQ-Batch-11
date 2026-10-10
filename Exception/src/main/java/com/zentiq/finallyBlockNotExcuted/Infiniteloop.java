package com.zentiq.finallyBlockNotExcuted;

public class Infiniteloop {

	public static void main(String[] args) {

        try {
            System.out.println("Try block");

            while (true) {
                // Infinite loop
            }

        } finally {
            System.out.println("Finally block");
        }
    }
}