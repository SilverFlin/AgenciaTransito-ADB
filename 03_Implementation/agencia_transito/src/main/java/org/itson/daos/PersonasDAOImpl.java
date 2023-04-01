/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.daos;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.itson.dominio.Persona;
import org.itson.excepciones.PersistenciaException;
import org.itson.interfaces.PersonasDAO;

/**
 *
 * @author Toled
 */
public class PersonasDAOImpl implements PersonasDAO {

    @PersistenceContext(unitName = "agencia_transito")
    private EntityManager entityManager;

    public PersonasDAOImpl() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("agencia_transito");
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public Optional<Persona> get(long id) {
        return Optional.ofNullable(entityManager.find(Persona.class, id));
    }

    @Override
    public Persona getByRFC(String RFC) {
        TypedQuery<Persona> query = entityManager.createNamedQuery("personaPorRFC", Persona.class);
        query.setParameter("RFC", RFC);
        return (Persona) query.getResultList();
    }

    @Override
    public List<Persona> getByNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Persona> getByAnho(int anho) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Persona> getAll() {

        String codigoJPQL = "SELECT p FROM Persona p ";
        TypedQuery<Persona> query = entityManager.createQuery(codigoJPQL, Persona.class);

        return query.getResultList();
    }

    @Override
    public Persona save(Persona persona) throws PersistenciaException {
        try {
            entityManager.getTransaction().begin();

            entityManager.persist(persona);

            entityManager.getTransaction().commit();
            return persona;
        } catch (Exception e) {
            throw new PersistenciaException("Error al guardar persona");
        }
    }

    @Override
    public Persona update(Persona t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Persona delete(Persona t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
