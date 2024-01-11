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

@WebServlet(name = "create", value = "/createclient")
public class CreateServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        Client client = new Client(
                request.getParameter("nom"),
                request.getParameter("prenom"),
                request.getParameter("mail"),
                request.getParameter("tel")
        );
        DaoClientImplv2 dao = new DaoClientImplv2();

        Client client1 = dao.createClient(client);

        request.setAttribute("idclient", client1.getId());

        this.getServletContext().getRequestDispatcher("/create.jsp").forward(request,response);
    }

    public void destroy() {
    }
}

