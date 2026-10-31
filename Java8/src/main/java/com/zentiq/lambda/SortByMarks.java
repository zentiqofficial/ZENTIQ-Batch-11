package com.zentiq.lambda;

import java.util.Comparator;

class SortByMarks implements Comparator<Student> {

	    public int compare(Student s1, Student s2) {
	        return s1.marks - s2.marks;
	    }
}
