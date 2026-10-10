package com.zentiq.Vector;

import java.util.Vector;

public class DeleteDataFromVector {

    public static void main(String[] args) {

        Vector<Integer> marks = new Vector<>();

        marks.add(80);
        marks.add(75);
        marks.add(90);
        marks.add(65);

        // Delete 75
        marks.remove(Integer.valueOf(75));

        for (int i = 0; i < marks.size(); i++) {
            System.out.println(marks.get(i));
        }
    }
}