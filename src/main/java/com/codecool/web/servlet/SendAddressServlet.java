package com.codecool.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SendAddressServlet")
public class SendAddressServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        if (req.getParameter("email").contains("@")) {
            req.getRequestDispatcher("received.jsp").forward(req, resp);
        }else{
            out.println("<h1>That's not a valid email address!</h1>");
        }

        /*req.getRequestDispatcher("received.jsp").forward(req, resp);*/
    }
}
