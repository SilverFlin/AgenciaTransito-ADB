/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.daos;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.itson.dominio.Persona;
import org.itson.excepciones.PersistenciaException;

/**
 *
 * @author Toled
 */
public class PersonasDAO implements DAO<Persona> {
    
    @PersistenceContext(unitName = "agencia_transito")
    private EntityManager entityManager;
    
    public PersonasDAO() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("agencia_transito");
        this.entityManager = managerFactory.createEntityManager();
    }
    
    @Override
    public Optional<Persona> get(long id) {
        return Optional.ofNullable(entityManager.find(Persona.class, id));
    }
    
    @Override
    public List<Persona> getAll() {
        
        String codigoJPQL = "SELECT p FROM Persona p ";
        TypedQuery<Persona> query = entityManager.createQuery(codigoJPQL, Persona.class);
        
        return query.getResultList();
    }
    
    @Override
    public void save(Persona persona) throws PersistenciaException {
        try {
            entityManager.getTransaction().begin();
            
            entityManager.persist(persona);
            
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            throw new PersistenciaException("Error al guardar persona");
        }
        
    }
    
    @Override
    public void update(Persona t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void delete(Persona t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
