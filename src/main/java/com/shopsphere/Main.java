package com.shopsphere;

import java.sql.Connection;

import com.shopsphere.config.DBConnection;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== ShopSphere =====");
        System.out.println("Connecting to database...");

        Connection connection = DBConnection.getConnection();

        if (connection != null) {
            System.out.println("Database connection established!");
        } else {
            System.out.println("Failed to connect to database.");
        }
    }
}