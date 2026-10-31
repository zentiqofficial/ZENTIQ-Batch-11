package com.zentiq.EagerLoadingSingletonDesignPattern;

public class Database1 {

    private static Database1 instance = null;

    private Database1() {
        System.out.println("DB Connection Created");
    }

    public static Database1 getInstance() {

        if (instance == null) {
            instance = new Database1();
        }

        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing: " + sql);
    }
}
