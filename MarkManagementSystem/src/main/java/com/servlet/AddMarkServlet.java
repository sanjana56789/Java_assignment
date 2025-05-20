package com.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class AddMarkServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get form input
        String studentName = request.getParameter("studentName");
        String subject = request.getParameter("subject");
        int marks = Integer.parseInt(request.getParameter("marks"));
        String examDate = request.getParameter("examDate"); // Should be in yyyy-MM-dd format

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/markdb", "root", "");

            // SQL query matches your column names exactly
            String sql = "INSERT INTO studentmarks (StudentName, Subject, Marks, ExamDate) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, studentName);
            ps.setString(2, subject);
            ps.setInt(3, marks);
            ps.setString(4, examDate);

            int status = ps.executeUpdate();

            if (status > 0) {
                out.println("<html><body>");
                out.println("<h2>Record Successfully Added!</h2>");
                out.println("<p><strong>Name:</strong> " + studentName + "</p>");
                out.println("<p><strong>Subject:</strong> " + subject + "</p>");
                out.println("<p><strong>Marks:</strong> " + marks + "</p>");
                out.println("<p><strong>Exam Date:</strong> " + examDate + "</p>");
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
