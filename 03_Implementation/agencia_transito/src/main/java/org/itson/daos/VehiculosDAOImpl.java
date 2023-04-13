package org.itson.daos;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.itson.dominio.Vehiculo;
import org.itson.excepciones.PersistenciaException;
import org.itson.interfaces.VehiculosDAO;
import static org.itson.utils.Constantes.PERSISTENCE_UNIT;

/**
 *
 * @author Toled
 */
public final class VehiculosDAOImpl implements VehiculosDAO {

    /**
     * EntiyManager, que gestiona las operaciones realizadas.
     */
    @PersistenceContext(unitName = PERSISTENCE_UNIT)
    private final EntityManager entityManager;

    /**
     * Constructor, que inicializa el Entity Manager.
     */
    public VehiculosDAOImpl() {
        EntityManagerFactory managerFactory
                = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public Optional<Vehiculo> get(final long id) {
        return Optional.ofNullable(entityManager.find(Vehiculo.class, id));
    }

    @Override
    public Optional<Vehiculo> getByMatricula(final String matricula) {
        TypedQuery<Vehiculo> query
                = entityManager.createNamedQuery(
                        "vehiculoPorMatricula",
                        Vehiculo.class);
        query.setParameter("matricula", matricula);

        Vehiculo vehiculo = null;
        try {
            vehiculo = (Vehiculo) query.getSingleResult();
        } catch (NoResultException e) {
            // No hace falta hacer nada.
        }

        return Optional.ofNullable(vehiculo);
    }

    @Override
    public List<Vehiculo> getAll() {
        String codigoJPQL = "SELECT v FROM Vehiculo v ";
        TypedQuery<Vehiculo> query
                = entityManager.createQuery(codigoJPQL, Vehiculo.class);

        return query.getResultList();
    }

    @Override
    public Vehiculo save(final Vehiculo vehiculo) throws PersistenciaException {
        try {
            entityManager.getTransaction().begin();

            entityManager.persist(vehiculo);

            entityManager.getTransaction().commit();
            return vehiculo;
        } catch (Exception e) {
            String msgError = "Error al guardar vehiculo: " + e.getMessage();
            throw new PersistenciaException(msgError);
        }
    }

    @Override
    public Vehiculo update(final Vehiculo t, final String[] params) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Vehiculo delete(final Vehiculo t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
