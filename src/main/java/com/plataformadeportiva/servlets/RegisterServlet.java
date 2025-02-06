package com.plataformadeportiva.servlets;

import com.plataformadeportiva.utils.DatabaseConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        if (username != null && password != null && email != null) {
            try (Connection conn = DatabaseConnection.getConnection()) {
                String query = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, username);
                statement.setString(2, password);
                statement.setString(3, email);

                int rowsInserted = statement.executeUpdate();

                if (rowsInserted > 0) {
                    // Redirigir al login después de registrar al usuario
                    response.sendRedirect("login.jsp");
                } else {
                    // Si la inserción falla
                    request.setAttribute("errorMessage", "Error al registrar el usuario.");
                    request.getRequestDispatcher("/register.jsp").forward(request, response);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Database error.");
            }
        } else {
            response.sendRedirect("register.jsp");  // Si no se reciben los parámetros necesarios
        }
    }
}
