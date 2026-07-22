package com.shopsphere.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/shopsphere";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Pyro@12345678";

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println(" Connected to MySQL successfully!");
            return connection;
        } catch (SQLException e) {
            System.out.println(" Database connection failed!");
            e.printStackTrace();
            return null;
        }
    }
}