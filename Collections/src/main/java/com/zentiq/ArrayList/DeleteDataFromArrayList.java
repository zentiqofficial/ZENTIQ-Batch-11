package com.zentiq.ArrayList;

import java.util.ArrayList;

public class DeleteDataFromArrayList {

	    public static void main(String[] args) {

	        ArrayList<Integer> marks = new ArrayList<>();

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