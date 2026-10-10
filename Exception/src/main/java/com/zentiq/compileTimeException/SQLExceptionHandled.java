package com.zentiq.compileTimeException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionHandled {
	
	public static void main(String[] args) {

        try {

            // Trying to connect to MySQL database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "wrongpassword"
            );

            System.out.println("Database connected successfully");

        } catch (SQLException e) {

            System.out.println("Database connection failed");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}