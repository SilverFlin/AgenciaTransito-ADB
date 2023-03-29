/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import org.itson.dominio.Persona;

/**
 *
 * @author Toled
 */
public class PersonasDAO {

    public static List<Persona> buscar() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("agencia_transito");
        EntityManager entityManager = managerFactory.createEntityManager();

        String codigoJPQL = "SELECT p FROM Persona p ";
        TypedQuery<Persona> query = entityManager.createQuery(codigoJPQL, Persona.class);
        
        return query.getResultList();
    }
}
