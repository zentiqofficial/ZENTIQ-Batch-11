package com.zentiq.ArrayList;

public class ArrayListImplementation {
	
	private int[] arr;   // internal array
    private int size;    // number of elements added

    // Step 1 - Default capacity = 10
    public ArrayListImplementation() {
        arr = new int[10];
        size = 0;
    }

    // Step 2 - Add element
    public void add(int data) {

        // Step 3 - If array is full, grow by 1.5x
        if (size == arr.length) {

            int newCapacity = arr.length + arr.length / 2;
            int[] newArr = new int[newCapacity];

            // Copy old elements
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }

            arr = newArr;

            System.out.println("Array resized to: " + arr.length);
        }

        arr[size] = data;
        size++;
    }

    // Step 4 - Get element by index
    public int get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        return arr[index];
    }

    // Step 5 - Remove element by index
    public void remove(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    // Step 6 - Total number of elements
    public int size() {
        return size;
    }

    // Step 7 - Print all elements
    public void print() {

        System.out.print("[");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);

            if (i < size - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}


