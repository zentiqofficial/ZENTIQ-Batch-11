package com.zentiq.list;

import java.util.ArrayList;
import java.util.List;

public class Code1 {
	
	public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("Anil");
        arrayList.add("Rahul");
        arrayList.add("Rohit");

        // Fast -> direct index access
        System.out.println(arrayList.get(0));   // Anil

        //Slow  elements shift to the right
        arrayList.add(1, "Ram");
        //arrayList.add("Ram");  //dublicate allowed

        System.out.println(arrayList);
        // [Anil, Ram, Rahul, Rohit]

        // Slow  elements shift to the left
        arrayList.remove(0);

        System.out.println(arrayList);
        // [Ram, Rahul, Rohit]
    }

}

//ArrayList provides fast random access using an index, so get(index) is O(1). 
//Inserting or removing an element from the middle or beginning requires shifting elements, so it is O(n).
