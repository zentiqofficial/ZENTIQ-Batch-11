package com.zentiq.EagerLoadingSingletonDesignPattern;

public class Database {

    // Rule 1: Private constructor
    // No one can create an object from outside this class
    private Database() {
        System.out.println("DB Connection Created");
    }

    // Rule 2: private static final variable
    // Object is created when the class is loaded (EAGER)
    // static -> belongs to the class
    // final -> cannot be reassigned
    private static final Database instance = new Database();

    // Rule 3: public static method
    // Always returns the same instance
    public static Database getInstance() {
        return instance;
    }

    // Normal method to show that the object works
    public void query(String sql) {
        System.out.println("Executing: " + sql);
    }
}


// First call -> returns the existing object
//Database d1 = Database.getInstance(); 

// Second call -> returns the same object
//Database d2 = Database.getInstance(); 

//Note - Singleton is a creational design pattern in Java that allows us to create only one object of a class.
//example - DBConnection 
//Rule 1: Private constructor
//Rule 2: private static final variable
//Rule 3: public static method
