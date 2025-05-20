package com.mysql;

import java.sql.*;
import java.util.Properties;

public class Mysql_select {
    public static void main(String[] args) {
        Connection dbConnection = null;
        try {
           // Connect to the MySQL database
            String url = "jdbc:mysql://localhost:3306/test"; // Note the port
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", ""); // Add your MySQL password if any
            dbConnection = DriverManager.getConnection(url, info);
            
            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database test");
            }

            // SELECT query
            String query = "SELECT * FROM coffee";
            Statement st = dbConnection.createStatement();
            ResultSet rs = st.executeQuery(query);

            // Print all records
            while (rs.next()) {
                int id = rs.getInt("id");
                String coffee_name = rs.getString("coffee_name");
                int price = rs.getInt("priced"); // column name is 'priced' in table
                System.out.format("\n%d, %s, %d", id, coffee_name, price);
            }

            // INSERT new record using PreparedStatement
            String insertQuery = "INSERT INTO coffee (coffee_name, priced) VALUES (?, ?)";
            PreparedStatement stmt = dbConnection.prepareStatement(insertQuery);
            stmt.setString(1, "Tajmahal");
            stmt.setInt(2, 950);
            stmt.executeUpdate();
            System.out.println("\nNew coffee record inserted successfully.");

            // Clean up
            stmt.close();
            st.close();
            dbConnection.close();

        } catch (SQLException ex) {
            System.out.println("An error occurred while accessing the MySQL database");
            ex.printStackTrace();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
}