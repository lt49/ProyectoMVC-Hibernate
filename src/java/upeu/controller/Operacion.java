/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import upeu.model.dao.AlumnoDao;
import upeu.model.dao.impl.AlumnoDaoImpl;
import upeu.model.entity.AlumnoDTO;

/**
 *
 * @author Emmanuel
 */
public class Operacion extends HttpServlet {

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
        AlumnoDao dao = new AlumnoDaoImpl();
        AlumnoDTO adto = new AlumnoDTO();
        
        
        String nombres = request.getParameter("nombres");
        nombres = request.getParameter("nombres")==null?nombres="":nombres;
        String apellidos = request.getParameter("apellidos");
        apellidos = request.getParameter("apellidos")==null?apellidos="":apellidos;
        String codigo = request.getParameter("codigo");
        codigo = request.getParameter("codigo")==null?codigo="":codigo;
        String operacion = request.getParameter("operacion");
        operacion = request.getParameter("operacion")==null?operacion="":operacion;
        
        int idalumno = request.getParameter("idalumno")==null?idalumno=0:Integer.parseInt(request.getParameter("idalumno"));
        List<AlumnoDTO> lista;
        
        System.out.println("ID:"+idalumno+" Nombres:"+nombres+" apellidos:"+apellidos+"codigo:"+codigo);
        
        switch(operacion){
            case "list":
                
                
                break;
            case "add":
                adto.setNombres(nombres);
                adto.setApellidos(apellidos);
                adto.setCodigo(codigo);
                
                dao.agregarAlumno(adto);
                
                lista = dao.listarAlumno();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("Alumnos/index.jsp").forward(request, response);
//                for (AlumnoDTO al : lista) {
//                    System.out.println("Nombre: "+al.getNombres()+" Apellidos: "+al.getApellidos()+" codigo: "+al.getCodigo());
//                }
                break;
            case "edit":
                //obtenemos el id dentro del case para no interr
                AlumnoDTO dTO = new AlumnoDTO();
                dTO.setIdalumno(idalumno);
                dTO.setNombres(nombres);
                dTO.setApellidos(apellidos);
                dTO.setCodigo(codigo);
                if (dao.editarAlumno(dTO)) {
                    System.out.println("Se Edito!!");
                } else {
                    System.out.println("Error al Editar");
                }
                
                lista = dao.listarAlumno();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("Alumnos/index.jsp").forward(request, response);
                break;
            case "find":                
                request.setAttribute("alumno", dao.buscarAlumno(idalumno));
                request.getRequestDispatcher("Alumnos/editarAlumno.jsp").forward(request, response);
                break;
            case "delete":
                //obtenemos el id dentro del case para no interrumpir
//                int idalumno = Integer.parseInt(request.getParameter("idalumno"));
//                idalumno = request.getParameter("idalumno")==null?idalumno=0:idalumno;
                
                dao.eliminarAlumno(idalumno);
                lista = dao.listarAlumno();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("Alumnos/index.jsp").forward(request, response);
                break;
            default:
                break;
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
