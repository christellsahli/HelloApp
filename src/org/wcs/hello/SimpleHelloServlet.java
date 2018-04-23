package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

@WebServlet(name = "SimpleHelloServlet",urlPatterns = {"/simple-hello"})
public class SimpleHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int hour = Integer.parseInt(request.getParameter("time").substring(0,2 ));
        String welcome = "Good morning";
        if (hour >= 20){
            welcome = "Good night";
        }
        else if (hour >= 12){
            welcome = "Good afternoon";
        }

        request.setAttribute("surname", request.getParameter("surname"));
        request.setAttribute("name",request.getParameter("name"));
        request.setAttribute("welcome", welcome);
        request.getRequestDispatcher("/custom-hello.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.print("Simple Hello!");

    }
}
