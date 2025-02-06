package com.plataformadeportiva.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")  // Indica que este servlet se activará cuando se acceda a la URL "/logout"
public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtiene la sesión actual sin crear una nueva
        HttpSession session = request.getSession(false);
        
        if (session != null) {
            // Invalida la sesión, es decir, la elimina
            session.invalidate();
        }

        // Redirige al usuario a la página de login después de cerrar la sesión
        response.sendRedirect("login.jsp");
    }
}
