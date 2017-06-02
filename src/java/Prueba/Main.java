/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import upeu.model.dao.AlumnoDao;
import upeu.model.dao.impl.AlumnoDaoImpl;
import upeu.model.entity.AlumnoDTO;
import upeu.model.util.HibernateUtil;

/**
 *
 * @author Luis Alberto
 */
public class Main {
    public static void main(String[] args) {
        if (HibernateUtil.getSessionFactory()!=null) {
            System.out.println("Exito: "+HibernateUtil.getSessionFactory().toString());
        }else{
            System.out.println("Error: "+HibernateUtil.getSessionFactory().toString());
        }
        
//        AlumnoDao dao = new AlumnoDaoImpl();
//        
//        for (AlumnoDTO alumnoDTO : dao.listarAlumno()) {
//            System.out.println("Nombres: "+alumnoDTO.getNombres());
//        }
        
        AlumnoDao dao = new AlumnoDaoImpl();
        AlumnoDTO alumnoDTO = new AlumnoDTO();
        alumnoDTO.setNombres("Victor");
        alumnoDTO.setApellidos("Cortes");
        alumnoDTO.setCodigo("47852104");
        
        System.out.println("IDGenerado es :"+dao.agregarTest(alumnoDTO));  



//100'000'000'000 // 20 000 000 000
        
//        byte a = -127;
//        int b = 5;
//        int c = -2147483000;
//        long d = 2000000000;
//        a = (byte)b;
//        System.out.println(a);
        
    }
}
