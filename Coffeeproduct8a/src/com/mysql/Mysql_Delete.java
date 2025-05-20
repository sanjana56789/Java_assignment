package com.mysql;

import java.sql.*;
import java.util.Properties;

public class Mysql_Delete {
    public static void main(String[] args) {
        try {
            Connection dbConnection = null;
            String url = "jdbc:mysql://localhost/test";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");

            dbConnection = DriverManager.getConnection(url, info);
            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database test");
            }

            // Display records before deletion
            String query = "SELECT * FROM coffee";
            Statement st = dbConnection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String coffee_name = rs.getString("coffee_name");
                int price = rs.getInt("price");
                System.out.format("\n%d, %s, %d", id, coffee_name, price);
            }

            rs.close();
            st.close();

            // Deleting the record with id=264
            String query3 = "DELETE FROM coffee WHERE id = 264";
            PreparedStatement preparedStmt2 = dbConnection.prepareStatement(query3);
            int rowsAffected = preparedStmt2.executeUpdate();
            preparedStmt2.close();

            System.out.println("\nRecord deleted successfully. Rows affected: " + rowsAffected);

            dbConnection.close();
        } catch (SQLException e) {
            System.err.println("SQL Exception occurred:");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Unexpected exception occurred:");
            e.printStackTrace();
        }
    }
}