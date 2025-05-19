package com.servlet;

import com.dao.MarkDAO;
import com.model.StudentMark;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.Date;

public class UpdateMarkServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("studentID"));
        String name = request.getParameter("studentName");
        String subject = request.getParameter("subject");
        int marks = Integer.parseInt(request.getParameter("marks"));
        Date examDate = Date.valueOf(request.getParameter("examDate"));

        StudentMark mark = new StudentMark();
        mark.setStudentID(id);
        mark.setStudentName(name);
        mark.setSubject(subject);
        mark.setMarks(marks);
        mark.setExamDate(examDate);

        try {
            new MarkDAO().updateMark(mark);
            response.sendRedirect("markdisplay.jsp");
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
