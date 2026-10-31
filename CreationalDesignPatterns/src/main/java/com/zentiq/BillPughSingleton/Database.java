package com.zentiq.BillPughSingleton;

public class Database {

    // Rule 1: Private constructor
    // Prevents object creation from outside this class
    private Database() {
        System.out.println("DB Connection Created");
    }

    // Rule 2: Private static inner class (Holder)
    // Holder class is not loaded when Database class loads.
    // It is loaded only when getInstance() is called for the first time.
    private static class Holder {

        // Object is created only once when Holder class is initialized.
        // JVM guarantees thread-safe class initialization.
        private static final Database INSTANCE = new Database();
    }

    // Rule 3: Public static method
    // First call initializes Holder and creates the object.
    // Subsequent calls return the same object.
    public static Database getInstance() {
        return Holder.INSTANCE;
    }

    // Normal method to demonstrate object usage
    public void query(String sql) {
        System.out.println("Executing Query: " + sql);
    }
}
