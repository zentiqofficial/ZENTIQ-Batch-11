package com.zentiq.finallyBlockNotExcuted;

public class JVMCrash {
	public static void main(String[] args) {

		try {
			System.out.println("Try block");

			throw new StackOverflowError();

		} finally {
			System.out.println("Finally block");
		}
	}
}

//Finally block normally executes, but if the JVM crashes or terminates abruptly, it may not execute.
