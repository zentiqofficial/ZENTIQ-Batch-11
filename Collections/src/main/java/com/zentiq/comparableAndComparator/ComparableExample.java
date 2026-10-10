package com.zentiq.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	
	public static void main(String[] args) {

        List<StudentComparable> list = new ArrayList<>();

        list.add(new StudentComparable("Anil", 80));
        list.add(new StudentComparable("Ravi", 60));
        list.add(new StudentComparable("Swati", 90));
        list.add(new StudentComparable("Mohan", 70));

        Collections.sort(list);

        System.out.println(list);
    }

}
