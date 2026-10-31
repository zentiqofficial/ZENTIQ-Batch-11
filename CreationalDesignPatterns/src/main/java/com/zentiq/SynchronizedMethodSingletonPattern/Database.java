package com.zentiq.SynchronizedMethodSingletonPattern;

public class Database {

    // Rule 1: Private static variable
    private static Database instance = null;

    // Rule 2: Private constructor
    private Database() {
        System.out.println("DB Connection Created");
    }

    // Rule 3: Public static synchronized method
    public static synchronized Database getInstance() {

        if (instance == null) {
            instance = new Database();
        }

        return instance;
    }

    // Normal method to show the object works
    public void query(String sql) {
        System.out.println("Executing: " + sql);
    }
}
