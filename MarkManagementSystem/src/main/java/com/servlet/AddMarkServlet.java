package com.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class AddMarkServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get data from form
        String name = request.getParameter("name");
        int marks = Integer.parseInt(request.getParameter("marks"));

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/markdb", "root", "");


            // Insert query
            String sql = "INSERT INTO marks (name, marks) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, marks);
            int status = ps.executeUpdate();

            if (status > 0) {
                out.println("<html><body>");
                out.println("<h2>Mark Successfully Added!</h2>");
                out.println("<p><strong>Name:</strong> " + name + "</p>");
                out.println("<p><strong>Marks:</strong> " + marks + "</p>");
                out.println("</body></html>");
            } else {
                out.println("<h2>Failed to add record.</h2>");
            }

            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }
}
