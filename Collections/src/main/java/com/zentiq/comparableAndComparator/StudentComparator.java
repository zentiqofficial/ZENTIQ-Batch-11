package com.zentiq.comparableAndComparator;

public class StudentComparator {

	    String name;
	    int marks;

	    public StudentComparator(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	    }

	    @Override
	    public String toString() {
	        return name + " " + marks;
	    }
}
