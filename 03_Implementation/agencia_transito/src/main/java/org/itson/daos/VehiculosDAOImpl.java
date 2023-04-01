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
import org.itson.dominio.Vehiculo;
import org.itson.excepciones.PersistenciaException;
import org.itson.interfaces.VehiculosDAO;

/**
 *
 * @author Toled
 */
public class VehiculosDAOImpl implements VehiculosDAO {

    @PersistenceContext(unitName = "agencia_transito")
    private EntityManager entityManager;

    public VehiculosDAOImpl() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("agencia_transito");
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public Optional<Vehiculo> get(long id) {
        return Optional.ofNullable(entityManager.find(Vehiculo.class, id));
    }

    @Override
    public Vehiculo getByMatricula(String Matricula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Vehiculo> getAll() {
        String codigoJPQL = "SELECT v FROM Vehiculo v ";
        TypedQuery<Vehiculo> query = entityManager.createQuery(codigoJPQL, Vehiculo.class);

        return query.getResultList();
    }

    @Override
    public Vehiculo save(Vehiculo vehiculo) throws PersistenciaException {
        try {
            entityManager.getTransaction().begin();

            entityManager.persist(vehiculo);

            entityManager.getTransaction().commit();
            return vehiculo;
        } catch (Exception e) {
            throw new PersistenciaException("Error al guardar vehiculo: " + e.getMessage());
        }
    }

    @Override
    public Vehiculo update(Vehiculo t, String[] params) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Vehiculo delete(Vehiculo t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
