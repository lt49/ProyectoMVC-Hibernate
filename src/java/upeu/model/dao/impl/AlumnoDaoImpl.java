/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.model.dao.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import upeu.model.dao.AlumnoDao;
import upeu.model.entity.AlumnoDTO;
import upeu.model.util.HibernateUtil;

/**
 *
 * @author Emmanuel
 */
public class AlumnoDaoImpl implements AlumnoDao{

   
    
    public AlumnoDaoImpl() {
    }    
    
    @Override
    public List<AlumnoDTO> listarAlumno() { 
        List<AlumnoDTO> listaAlumnos = null;
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query query;
        try {
            listaAlumnos = new ArrayList<>();
            query = session.createQuery("from AlumnoDTO");
            listaAlumnos = query.list();
        } catch (Exception e) {
            
            System.out.println("ERROR Listar Alumno: "+e.getMessage());
        }
        finally{
            session.close();
        }
        return listaAlumnos;
    }

    @Override
    public boolean agregarAlumno(AlumnoDTO alumnoDTO) {
        boolean flag = false;
//        EntityManagerFactory ef = null;
//        EntityManager em = null;
//        EntityTransaction et = null;
//        try {
//            ef = ConexionJPA.getInstance();
//            em = ef.createEntityManager();
//            et = em.getTransaction();
//            et.begin();
//            em.persist(alumnoDTO);
//            et.commit();
//            em.close();
//            flag = true;
//        } catch (Exception e) {
//            et.rollback();
//            em.close();
//            flag = false;
//        }
        return flag;
    }

    @Override
    public boolean editarAlumno(AlumnoDTO alumnoDTO) {
        boolean flag = false;
//        EntityManagerFactory ef = null;
//        EntityManager em = null;
//        EntityTransaction et = null;
//        try {
//            ef = ConexionJPA.getInstance();
//            em = ef.createEntityManager();
//            et = em.getTransaction();
//            et.begin();
//            em.merge(alumnoDTO);
//            et.commit();
//            em.close();
//            flag = true;
//            
//        } catch (Exception e) {
//            et.rollback();
//            em.close();
//            System.out.println("ERROR EDITAR ALUMNO: "+e.getMessage());
//        }
        return flag;
    }

    @Override
    public boolean eliminarAlumno(int id) {
        boolean flag = false;
//        EntityManagerFactory ef = null;
//        EntityManager em = null;
//        EntityTransaction et = null;
//        AlumnoDTO adto = null;
//        try {
//            ef = ConexionJPA.getInstance();
//            em = ef.createEntityManager();
//            et = em.getTransaction();
//            et.begin();
//            adto = em.find(AlumnoDTO.class, id);
//            em.remove(adto);
//            et.commit();
//            em.close();
//            flag = true;
//        } catch (Exception e) {
//        }
        return flag;
    }

    @Override
    public boolean validarUsuario(String usuario, String clave) {
        boolean flag = false;
//        EntityManagerFactory ef = null;
//        EntityManager em = null;
//        Query query = null;   
//        try {
//            ef = ConexionJPA.getInstance();
//            em = ef.createEntityManager();
//            query = em.createQuery("select u from UsuarioDTO u where u.usuario = :user and u.clave = :pass");
//            query.setParameter("user", usuario);
//            query.setParameter("pass", clave);
//            if (query.getSingleResult() != null) {
//                flag = true;
//            }
//            em.close();
//        } catch (Exception e) {
//            em.close();
//            System.out.println("Error ValidarUsuario: "+e.getMessage());
//        }
            
        return flag;
    }

    @Override
    public AlumnoDTO buscarAlumno(int id) {
        AlumnoDTO adto = null;
//        EntityManagerFactory ef = null;
//        EntityManager em = null;  
//        try {
//            ef = ConexionJPA.getInstance();
//            em = ef.createEntityManager();
//            adto = em.find(AlumnoDTO.class, id);
//            em.close();
//        } catch (Exception e) {
//            em.close();
//            System.out.println("ERROR BUSCAR ALUMNO: "+e.getMessage());
//        }
        return adto;
    }
    @Override
    public int agregarTest(AlumnoDTO alumnoDTO) {
        int id = 0;
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(alumnoDTO);
        session.flush();
        id = alumnoDTO.getIdalumno();
        tx.commit();
        try {
            
        } catch (Exception e) {
            System.out.println("Error agregarTest: "+e.getMessage());
        }
        finally{
            session.close();
        }
        return id;
    }
    
}
