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
import java.util.List;

@WebServlet(name = "allclient", value = "/allclient")
public class GetAllServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        DaoClientImplv2 dao = new DaoClientImplv2();
        try {
            List<Client> clients = dao.getAll();
            request.setAttribute("clients",clients);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        this.getServletContext().getRequestDispatcher("/GetAll.jsp").forward(request,response);
    }

    public void destroy() {
    }
}

