/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.model.dao;

import java.util.ArrayList;
import java.util.List;
import upeu.model.entity.AlumnoDTO;

/**
 *
 * @author Emmanuel
 */
public interface AlumnoDao {
    
    public List<AlumnoDTO> listarAlumno();
    public boolean agregarAlumno(AlumnoDTO alumnoDTO);
    public boolean editarAlumno(AlumnoDTO alumnoDTO);
    public boolean eliminarAlumno(int id);
    public AlumnoDTO buscarAlumno(int id);
    
    public boolean validarUsuario(String usuario, String clave);
    
    
    public int agregarTest(AlumnoDTO alumnoDTO);
    
}
