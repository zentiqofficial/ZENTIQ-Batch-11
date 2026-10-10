package com.zentiq.Vector;

import java.util.Vector;

public class SearchDataFromVector {

    public static void main(String[] args) {

        Vector<Integer> marks = new Vector<>();

        marks.add(80);
        marks.add(75);
        marks.add(90);
        marks.add(65);

        // Want to search 90
        System.out.println(marks.contains(90));
    }
}