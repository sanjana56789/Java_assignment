package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/prime")
public class PrimeCheckServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><body>");
            out.println("<h2>Prime Number Checker Result</h2>");
            out.println("<p>Number: " + number + "</p>");
            out.println("<p>Result: " + (isPrime ? "It is a Prime Number" : "It is NOT a Prime Number") + "</p>");
            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<html><body>");
            out.println("<p>Please enter a valid number.</p>");
            out.println("<a href='index.html'>Go Back</a>");
            out.println("</body></html>");
        }
    }
}
