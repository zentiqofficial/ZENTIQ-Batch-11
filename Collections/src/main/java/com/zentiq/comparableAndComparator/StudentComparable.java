package com.zentiq.comparableAndComparator;

class StudentComparable implements Comparable<StudentComparable> {

    String name;
    int marks;

    StudentComparable(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentComparable s) {

        return this.marks - s.marks;
    }

    @Override
    public String toString() {
        return name + " " + marks;
    }
}
