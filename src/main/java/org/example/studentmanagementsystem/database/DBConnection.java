package org.example.studentmanagementsystem.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    // Using your specific database connection details
    private static final String URL = "jdbc:postgresql://localhost:5432/studentdb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "CAPRICORN12232005@joys";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.err.println("Database connection error: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}