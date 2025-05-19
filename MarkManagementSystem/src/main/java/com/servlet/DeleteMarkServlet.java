package com.servlet;

import com.dao.MarkDAO;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class DeleteMarkServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("studentID"));

        try {
            new MarkDAO().deleteMark(id);
            response.sendRedirect("markdisplay.jsp");
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
