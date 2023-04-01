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
import org.itson.dominio.Placa;
import org.itson.excepciones.PersistenciaException;
import org.itson.interfaces.PlacasDAO;

/**
 *
 * @author Toled
 */
public class PlacasDAOImpl implements PlacasDAO {

    @PersistenceContext(unitName = "agencia_transito")
    private EntityManager entityManager;

    public PlacasDAOImpl() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("agencia_transito");
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public Optional<Placa> get(long id) {
        return Optional.ofNullable(entityManager.find(Placa.class, id));
    }

    @Override
    public List<Placa> getAll() {
        String codigoJPQL = "SELECT p FROM Placa p ";
        TypedQuery<Placa> query = entityManager.createQuery(codigoJPQL, Placa.class);

        return query.getResultList();
    }

    @Override
    public Placa save(Placa placa) throws PersistenciaException {
        try {
            entityManager.getTransaction().begin();

            entityManager.persist(placa);

            entityManager.getTransaction().commit();
            return placa;
        } catch (Exception e) {
            throw new PersistenciaException("Error al guardar placa");
        }
    }

    @Override
    public Placa update(Placa t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Placa delete(Placa t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
