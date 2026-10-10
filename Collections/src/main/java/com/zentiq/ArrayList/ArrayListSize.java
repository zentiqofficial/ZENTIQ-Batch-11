package com.zentiq.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSize {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Size: " + list.size());

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Size: " + list.size());

        list.add(40);
        list.add(50);

        System.out.println("Size: " + list.size());
    }
}