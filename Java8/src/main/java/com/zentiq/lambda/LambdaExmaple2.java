package com.zentiq.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExmaple2 {
	
	public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Anil", 80));
        list.add(new Student("Ravi", 60));
        list.add(new Student("Swati", 90));
        list.add(new Student("Raj", 70));

        // Sort by marks with lambda
        list.sort((s1, s2) -> s1.marks - s2.marks);

        for (Student s : list) {
            System.out.println(s.name + " - " + s.marks);
        }
    }

}
