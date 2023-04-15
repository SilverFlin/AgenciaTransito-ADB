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
import org.itson.utils.ConfiguracionPaginado;
import static org.itson.utils.Constantes.PERSISTENCE_UNIT;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public final class PlacasDAOImpl implements PlacasDAO {

    /**
     * EntiyManager, que gestiona las operaciones realizadas.
     */
    @PersistenceContext(unitName = PERSISTENCE_UNIT)
    private final EntityManager entityManager;

    /**
     * Constructor, que inicializa el Entity Manager.
     */
    public PlacasDAOImpl() {
        EntityManagerFactory managerFactory
                = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public Optional<Placa> get(final long id) {
        return Optional.ofNullable(entityManager.find(Placa.class, id));
    }

    @Override
    public List<Placa> getAll() {
        String queryJpql = "SELECT p FROM Placa p ";
        TypedQuery<Placa> query
                = entityManager.createQuery(queryJpql, Placa.class);

        return query.getResultList();
    }

    @Override
    public List<Placa> getAll(final ConfiguracionPaginado paginado) {
        String queryJpql = "SELECT p FROM Placa p ";
        TypedQuery<Placa> typedQuery
                = entityManager.createQuery(queryJpql, Placa.class);

        typedQuery.setFirstResult(paginado.getOffset());
        typedQuery.setMaxResults(paginado.getLimite());

        return typedQuery.getResultList();
    }

    @Override
    public Placa save(final Placa placa) throws PersistenciaException {
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
    public Placa update(final Placa placa) throws PersistenciaException {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entityManager.merge(placa));
            entityManager.getTransaction().commit();
            return placa;
        } catch (Exception e) {
            String msgError = "Error al actualizar placa: " + e.getMessage();
            throw new PersistenciaException(msgError);
        }
    }

    @Override
    public Placa delete(final Placa t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
