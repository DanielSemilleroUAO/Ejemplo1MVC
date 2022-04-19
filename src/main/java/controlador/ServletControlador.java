/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

/**
 *
 * @author adseglocdom
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Procesar los parametros

        // Crear JavaBeans 
        Rectangulo rectangulo = new Rectangulo(3, 6);

        // Agregamos al javabean el alcance
        req.setAttribute("mensaje", "Saludos desde el Servlet");
        
        HttpSession sesion = req.getSession();
        sesion.setAttribute("rectangulo", rectangulo);
        
        // Redireccionar a la vista seleccionada
        RequestDispatcher rd = req.getRequestDispatcher("vista/despliegueVariables.jsp");
        rd.forward(req, resp);
    }

}
