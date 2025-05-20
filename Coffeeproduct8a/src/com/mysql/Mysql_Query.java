package com.mysql;

import java.sql.*;
import java.util.Properties;

public class Mysql_Query {
    public static void main(String[] args) {
        Connection dbConnection = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            String url = "jdbc:mysql://localhost/test";
            Properties info = new Properties();
            info.put("user", "root");
            info.put("password", "");

            dbConnection = DriverManager.getConnection(url, info);

            if (dbConnection != null) {
                System.out.println("Successfully connected to MySQL database test");
            }

            String query = "SELECT * FROM coffee WHERE coffee_name LIKE 'D%'";

            // create the java statement
            st = dbConnection.createStatement();

            // execute the query, and get a java resultset
            rs = st.executeQuery(query);

            // iterate through the java resultset
            while (rs.next()) {
                int id = rs.getInt("id");
                String coffee_name = rs.getString("coffee_name");
                int price = rs.getInt("price");

                // print the results
                System.out.format("\n%d %s %d", id, coffee_name, price);
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred while connecting to MySQL database");
            ex.printStackTrace();
        } finally {
            // close resources in reverse order of opening
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (st != null) st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (dbConnection != null) dbConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}