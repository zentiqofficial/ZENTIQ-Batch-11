package com.zentiq.ArrayList;

import java.util.ArrayList;

public class StudentData {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("Rahul", 20, 85.5, 'A', "Delhi");
        Student s2 = new Student("Amit", 21, 90.0, 'A', "Mumbai");

        students.add(s1);
        students.add(s2);

        for (Student student : students) {

            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println("Marks: " + student.marks);
            System.out.println("Grade: " + student.grade);
            System.out.println("City: " + student.city);

            System.out.println("------------------");
        }
    }
}