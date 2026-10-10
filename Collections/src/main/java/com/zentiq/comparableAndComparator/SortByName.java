package com.zentiq.comparableAndComparator;

import java.util.Comparator;

public class SortByName implements Comparator<StudentComparator> {

    @Override
    public int compare(StudentComparator s1, StudentComparator s2) {

        return s1.name.compareTo(s2.name);
    }
}