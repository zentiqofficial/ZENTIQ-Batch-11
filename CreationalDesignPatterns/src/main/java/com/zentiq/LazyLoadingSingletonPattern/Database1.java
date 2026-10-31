package com.zentiq.LazyLoadingSingletonPattern;

public class Database1 {
	
    // Rule 1: private static variable
    // Initially null -> object is not created yet (LAZY)
    private static Database1 instance = null;
    
    // Rule 2: private constructor
    // No one can call new Database1() from outside this class
    private Database1() {
        System.out.println("DB Connection Created");
    }

    // Rule 3: public static method
    // Object is created only on the first call
    public static Database1 getInstance() {

        if (instance == null) {
            // First call only
            instance = new Database1();
        }

        // Return the same object every time
        return instance;
    }

    // Normal method to show that the object works
    public void query(String sql) {
        System.out.println("Executing: " + sql);
    }
}
