package com.zentiq.Vector;

import java.util.Vector;

public class StudentData {

    public static void main(String[] args) {

        Vector<Student> students = new Vector<>();

        Student s1 = new Student(
                "Anil", 20, 85.5, 'A', "Delhi"
        );

        Student s2 = new Student(
                "Amit", 21, 90.0, 'A', "Mumbai"
        );

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