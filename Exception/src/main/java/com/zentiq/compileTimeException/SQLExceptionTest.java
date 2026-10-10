package com.zentiq.compileTimeException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionTest {
	
	public static void main(String[] args) throws SQLException {

            // Trying to connect to MySQL database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "wrongpassword"
            );

            System.out.println("Database connected successfully");

            System.out.println("Database connection failed");
 
    }
}

//SQLException is a checked exception.
//It can occur when a database operation fails,
//such as connection failure, invalid SQL,
//or other database-related problems.
//
//Because it is a checked exception,
//the compiler requires us to handle it
//using try-catch or declare it using throws.