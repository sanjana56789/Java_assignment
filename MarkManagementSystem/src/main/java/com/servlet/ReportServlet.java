package com.servlet;

import com.dao.MarkDAO;
import com.model.StudentMark;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ReportServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("reportType");
        List<StudentMark> results = null;

        try {
            MarkDAO dao = new MarkDAO();
            switch (type) {
                case "topN":
                    int topN = Integer.parseInt(request.getParameter("topN"));
                    results = dao.getTopNStudents(topN);
                    break;
                case "threshold":
                    int threshold = Integer.parseInt(request.getParameter("threshold"));
                    results = dao.getMarksAboveThreshold(threshold);
                    break;
                case "subject":
                    String subject = request.getParameter("subject");
                    results = dao.getMarksBySubject(subject);
                    break;
            }

            request.setAttribute("reportResults", results);
            RequestDispatcher rd = request.getRequestDispatcher("report_result.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
