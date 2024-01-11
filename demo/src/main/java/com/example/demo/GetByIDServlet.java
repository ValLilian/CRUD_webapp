package com.example.demo;

import com.example.demo.dao.DaoClientImplv2;
import com.example.demo.entity.Client;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "client", value = "/client")
public class GetByIDServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        Client client;

        String keyId = request.getParameter("id");

        DaoClientImplv2 dao = new DaoClientImplv2();
        try {
            if (keyId!=null) {
                client = dao.getByID(Integer.valueOf(keyId));
            } else  {
                client = dao.getByID(Integer.valueOf(1));
            }
            request.setAttribute("client",client);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        this.getServletContext().getRequestDispatcher("/GetByID.jsp").forward(request,response);
    }

    public void destroy() {
    }
}

