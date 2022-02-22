package com.org.personal.controller;

import com.org.personal.dao.UserDAO;
import com.org.personal.model.Users;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login", value = "/login")
public class UsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDAO users = new UserDAO();
        Users user = users.user(request.getParameter("username"));
        if(user != null) {
            if(request.getParameter("password").equals(user.getPassword())) {
                PrintWriter out = response.getWriter();
                out.println(user.getFirst_name() + " " + user.getLast_name());
            } else {
                PrintWriter out = response.getWriter();
                out.println("Invalid Credentials");
            }
        }
        else {
            PrintWriter out = response.getWriter();
            out.println("User doesn't exist");
        }
    }
}
