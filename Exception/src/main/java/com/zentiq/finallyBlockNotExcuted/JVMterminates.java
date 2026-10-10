package com.zentiq.finallyBlockNotExcuted;

public class JVMterminates {

    public static void main(String[] args) {

        try {
            System.out.println("Try block");

            System.exit(0); // JVM terminates here

        } finally {
            System.out.println("Finally block");
        }
    }
}