/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.model.dao.impl;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import upeu.model.entity.AlumnoDTO;

/**
 *
 * @author Luis Alberto
 */
public class AlumnoDaoImplIT {
    
    public AlumnoDaoImplIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of listarAlumno method, of class AlumnoDaoImpl.
     */
    @Test
    public void testListarAlumno() {
        System.out.println("listarAlumno");
        AlumnoDaoImpl instance = new AlumnoDaoImpl();
        List<AlumnoDTO> expResult = null;
        List<AlumnoDTO> result = instance.listarAlumno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarAlumno method, of class AlumnoDaoImpl.
     */
    @Test
    public void testAgregarAlumno() {
        System.out.println("agregarAlumno");
        
        AlumnoDTO alumnoDTO = new AlumnoDTO();
        alumnoDTO.setNombres("Victor");
        alumnoDTO.setApellidos("Cortes");
        alumnoDTO.setCodigo("47852104");
        AlumnoDaoImpl instance = new AlumnoDaoImpl();
        int expResult = 3;
        int result = instance.agregarTest(alumnoDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult!=result) {
            fail("The test case is a prototype.");
            System.out.println("IDGenerado: "+result);
        }else{
            System.out.println("IDGenerado: "+result);
        }
        
    }

    /**
     * Test of editarAlumno method, of class AlumnoDaoImpl.
     */
    @Test
    public void testEditarAlumno() {
        System.out.println("editarAlumno");
        AlumnoDTO alumnoDTO = null;
        AlumnoDaoImpl instance = new AlumnoDaoImpl();
        boolean expResult = false;
        boolean result = instance.editarAlumno(alumnoDTO);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarAlumno method, of class AlumnoDaoImpl.
     */
    @Test
    public void testEliminarAlumno() {
        System.out.println("eliminarAlumno");
        int id = 0;
        AlumnoDaoImpl instance = new AlumnoDaoImpl();
        boolean expResult = false;
        boolean result = instance.eliminarAlumno(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarUsuario method, of class AlumnoDaoImpl.
     */
    @Test
    public void testValidarUsuario() {
        System.out.println("validarUsuario");
        String usuario = "";
        String clave = "";
        AlumnoDaoImpl instance = new AlumnoDaoImpl();
        boolean expResult = false;
        boolean result = instance.validarUsuario(usuario, clave);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarAlumno method, of class AlumnoDaoImpl.
     */
    @Test
    public void testBuscarAlumno() {
        System.out.println("buscarAlumno");
        int id = 0;
        AlumnoDaoImpl instance = new AlumnoDaoImpl();
        AlumnoDTO expResult = null;
        AlumnoDTO result = instance.buscarAlumno(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
