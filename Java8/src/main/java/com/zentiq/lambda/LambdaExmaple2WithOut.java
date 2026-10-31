package com.zentiq.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExmaple2WithOut {
	
	public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Anil", 80));
        list.add(new Student("Ravi", 60));
        list.add(new Student("Swati", 90));
        list.add(new Student("Raj", 70));

        // Sort by marks without lambda
        list.sort(new SortByMarks());

        for (Student s : list) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}
