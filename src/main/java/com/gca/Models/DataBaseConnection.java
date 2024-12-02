package com.gca.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private static Connection con = null;

    public static Connection GetConnection() {
        if (con == null) {
            try {
                System.out.println("Connecting to database...");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_clinique", "root", "password");
                System.out.println("Connected successfully!");

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return con;
    }

}