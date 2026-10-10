package com.zentiq.array;

public class DifferentTypeArray {

	public static void main(String[] args) {

		// Student Names
		String[] names = { "Anil", "Ravi", "Amit" };

		// Student Ages
		int[] ages = { 28, 25, 24 };

		// Student Salaries
		double[] salaries = { 25000.50, 30000.50, 35000.50 };

		// Student Grades
		char[] grades = { 'A', 'B', 'A' };

		// Student Cities
		String[] cities = { "Delhi", "Mumbai", "Pune" };

		// Print Student 1
		System.out.println("Name: " + names[0]);
		System.out.println("Age: " + ages[0]);
		System.out.println("Salary: " + salaries[0]);
		System.out.println("Grade: " + grades[0]);
		System.out.println("City: " + cities[0]);

		System.out.println("-------------------");

		// Print Student 2
		System.out.println("Name: " + names[1]);
		System.out.println("Age: " + ages[1]);
		System.out.println("Salary: " + salaries[1]);
		System.out.println("Grade: " + grades[1]);
		System.out.println("City: " + cities[1]);

		System.out.println("-------------------");

		// Print Student 3
		System.out.println("Name: " + names[2]);
		System.out.println("Age: " + ages[2]);
		System.out.println("Salary: " + salaries[2]);
		System.out.println("Grade: " + grades[2]);
		System.out.println("City: " + cities[2]);
	}

}

//Array is useful for storing multiple values of the same type.
//But when data becomes large and needs flexible management,  using arrays can become difficult. 
//The Java Collection Framework provides more flexible ways to store and manage data
