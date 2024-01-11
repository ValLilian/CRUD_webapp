package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "helloServlet", value = "/accueil")
public class AccueilServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.setContentType("text/html");
        this.getServletContext().getRequestDispatcher("/accueil.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
