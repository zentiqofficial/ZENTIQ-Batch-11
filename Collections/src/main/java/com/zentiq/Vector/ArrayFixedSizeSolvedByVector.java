package com.zentiq.Vector;

import java.util.Vector;

public class ArrayFixedSizeSolvedByVector {

    public static void main(String[] args) {

        Vector<Integer> marks = new Vector<>();

        marks.add(80);
        marks.add(75);
        marks.add(90);

        // Vector can grow dynamically
        marks.add(85);

        for (int i = 0; i < marks.size(); i++) {
            System.out.println(marks.get(i));
        }
    }
}