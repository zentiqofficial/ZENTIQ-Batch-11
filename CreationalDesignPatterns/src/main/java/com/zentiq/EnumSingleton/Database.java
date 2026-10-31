package com.zentiq.EnumSingleton;

public enum Database {

    // Single instance
    // JVM creates it only once when the enum class is initialized.
    // Enum constants are implicitly public static final.
    INSTANCE;

    // Enum constructor is implicitly private.
    // Cannot create enum objects using the new keyword.
    Database() {
        System.out.println("DB Connection Created");
    }

    // Normal method to demonstrate object usage
    public void query(String sql) {
        System.out.println("Executing: " + sql);
    }
}