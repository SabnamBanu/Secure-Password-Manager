package com.passwordmanager.util;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/password_manager",
                    "root",
                    "Your_Password"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}