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
import org.itson.dominio.Pago;
import org.itson.excepciones.PersistenciaException;
import org.itson.interfaces.PagosDAO;

/**
 *
 * @author Toled
 */
public class PagosDAOImpl implements PagosDAO {

    @PersistenceContext(unitName = "agencia_transito")
    private EntityManager entityManager;

    public PagosDAOImpl() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("agencia_transito");
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public Optional<Pago> get(long id) {
        return Optional.ofNullable(entityManager.find(Pago.class, id));
    }

    @Override
    public List<Pago> getAll() {
        String codigoJPQL = "SELECT p FROM Pago p ";
        TypedQuery<Pago> query = entityManager.createQuery(codigoJPQL, Pago.class);

        return query.getResultList();
    }

    @Override
    public Pago save(Pago pago) throws PersistenciaException {
        try {
            entityManager.getTransaction().begin();

            entityManager.persist(pago);

            entityManager.getTransaction().commit();
            return pago;
        } catch (Exception e) {
            throw new PersistenciaException("Error al guardar pago");
        }
    }

    @Override
    public Pago update(Pago t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Pago delete(Pago t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
