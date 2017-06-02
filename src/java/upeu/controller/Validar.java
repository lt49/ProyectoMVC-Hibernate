/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.String;
import javax.servlet.http.HttpSession;
import upeu.model.dao.AlumnoDao;
import upeu.model.dao.impl.AlumnoDaoImpl;
/**
 *
 * @author Emmanuel
 */
public class Validar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        usuario = request.getParameter("usuario")==null?usuario="":usuario;
        String clave = request.getParameter("clave");
        clave = request.getParameter("clave")==null?clave="":clave;
        HttpSession session = request.getSession();
        
        //para mostrar la lista de alumnos en el index.jsp, se Setea al request la lista de alumnos
        
        
        AlumnoDao dao = new AlumnoDaoImpl();
                
        if (dao.validarUsuario(usuario, clave)) {
            //Se envia la lista en el request
            request.setAttribute("lista", dao.listarAlumno());
            
            session.setAttribute("usuario", usuario);
            request.setAttribute("usuario", usuario);
            request.getRequestDispatcher("Alumnos/index.jsp").forward(request, response);
            
        } else {
            response.sendRedirect(request.getContextPath());
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
