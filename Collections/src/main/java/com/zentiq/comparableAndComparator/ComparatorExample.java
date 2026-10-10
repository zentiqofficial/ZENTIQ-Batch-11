package com.zentiq.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
	

    public static void main(String[] args) {

        List<StudentComparator> list = new ArrayList<>();

        list.add(new StudentComparator("Anil", 80));
        list.add(new StudentComparator("Ravi", 60));
        list.add(new StudentComparator("Swati", 90));
        list.add(new StudentComparator("Mohan", 70));

        // Sort by Marks
        Collections.sort(list, new SortByMarks());

        System.out.println("Sort by Marks:");
        System.out.println(list);


        // Sort by Name
        Collections.sort(list, new SortByName());

        System.out.println("Sort by Name:");
        System.out.println(list);
    }
}
