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
import org.itson.dominio.Tramite;
import org.itson.excepciones.PersistenciaException;
import org.itson.interfaces.TramitesDAO;
import org.itson.utils.FiltrosTramites;

/**
 *
 * @author Toled
 */
public class TramitesDAOImpl implements TramitesDAO {

    @PersistenceContext(unitName = "agencia_transito")
    private EntityManager entityManager;

    public TramitesDAOImpl() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("agencia_transito");
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public Optional<Tramite> get(long id) {
        return Optional.ofNullable(entityManager.find(Tramite.class, id));
    }

    @Override
    public List<Tramite> getAll() {
        String codigoJPQL = "SELECT t FROM Tramite t ";
        TypedQuery<Tramite> query = entityManager.createQuery(codigoJPQL, Tramite.class);

        return query.getResultList();
    }

    @Override
    public List<Tramite> getAll(FiltrosTramites filtros) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Tramite save(Tramite tramite) throws PersistenciaException {
        throw new PersistenciaException("No se pueden guardar registros de Tramite");
    }

    @Override
    public Tramite update(Tramite t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Tramite delete(Tramite t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
