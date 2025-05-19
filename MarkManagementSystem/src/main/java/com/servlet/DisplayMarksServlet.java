package com.servlet;

import com.dao.MarkDAO;
import com.model.StudentMark;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class DisplayMarksServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<StudentMark> list = new MarkDAO().getAllMarks();
            request.setAttribute("marksList", list);
            RequestDispatcher rd = request.getRequestDispatcher("markdisplay.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
