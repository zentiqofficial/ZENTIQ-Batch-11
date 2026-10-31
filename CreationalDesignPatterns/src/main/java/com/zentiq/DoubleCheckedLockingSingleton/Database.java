package com.zentiq.DoubleCheckedLockingSingleton;

public class Database {

    // Rule 2: private static volatile variable
    // volatile ensures visibility and prevents instruction reordering
    private static volatile Database instance = null;

    // Rule 1: private constructor
    // Prevents object creation from outside this class
    private Database() {
        System.out.println("DB Connection Created");
    }

    // Rule 3: public static method
    public static Database getInstance() {

        // First check: Avoid locking if object already exists
        if (instance == null) {

            // Only one thread can enter this block at a time
            synchronized (Database.class) {

                // Second check: Another thread may have created the object
                // while the current thread was waiting for the lock
                if (instance == null) {
                    instance = new Database();
                }
            }
        }

        // Return the same object every time
        return instance;
    }

    // Normal method to demonstrate object usage
    public void query(String sql) {
        System.out.println("Executing Query: " + sql);
    }
}