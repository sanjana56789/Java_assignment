package com.mysql;

import java.sql.*;
import java.util.Properties;

public class Mysql_Update {
    public static void main(String[] args) {
        Connection dbConnection = null;

        try {
            // Step 1: Connect to database
            String url = "jdbc:mysql://localhost:3306/test"; // use port 3306 explicitly
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");
            dbConnection = DriverManager.getConnection(url, info);

            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database test");
            }

            // Step 2: Display all current records
            String query = "SELECT * FROM coffee";
            Statement st = dbConnection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String coffee_name = rs.getString("coffee_name");
                int price = rs.getInt("priced"); // corrected column name
                System.out.format("\n%d %s %d", id, coffee_name, price);
            }
            rs.close();
            st.close();

            // Step 3: Update record
            String query2 = "UPDATE coffee SET priced = 950 WHERE id = 102";
            PreparedStatement preparedStmt1 = dbConnection.prepareStatement(query2);
            int rowsUpdated = preparedStmt1.executeUpdate();
            preparedStmt1.close();

            if (rowsUpdated > 0) {
                System.out.println("\n\nRecord updated successfully.");
            } else {
                System.out.println("\n\nNo matching record found to update.");
            }

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
