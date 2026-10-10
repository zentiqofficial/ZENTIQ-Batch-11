package com.zentiq.comparableAndComparator;

import java.util.Comparator;

public class SortByMarks implements Comparator<StudentComparator> {

    @Override
    public int compare(StudentComparator s1, StudentComparator s2) {

        return s1.marks - s2.marks;
    }
}