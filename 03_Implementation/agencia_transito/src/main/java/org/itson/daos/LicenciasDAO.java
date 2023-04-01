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
import org.itson.dominio.Licencia;
import org.itson.excepciones.PersistenciaException;

/**
 *
 * @author Toled
 */
public class LicenciasDAO implements DAO<Licencia> {

    @PersistenceContext(unitName = "agencia_transito")
    private EntityManager entityManager;

    public LicenciasDAO() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("agencia_transito");
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public Optional<Licencia> get(long id) {
        return Optional.ofNullable(entityManager.find(Licencia.class, id));
    }

    @Override
    public List<Licencia> getAll() {
        String codigoJPQL = "SELECT l FROM Licencia l ";
        TypedQuery<Licencia> query = entityManager.createQuery(codigoJPQL, Licencia.class);

        return query.getResultList();
    }

    @Override
    public Licencia save(Licencia licencia) throws PersistenciaException {
        try {
            entityManager.getTransaction().begin();

            entityManager.persist(licencia);

            entityManager.getTransaction().commit();
            return licencia;
        } catch (Exception e) {
            throw new PersistenciaException("Error al guardar licencia");

        }
    }

    @Override
    public Licencia update(Licencia t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Licencia delete(Licencia t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
