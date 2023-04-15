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
import org.itson.utils.ConfiguracionPaginado;
import static org.itson.utils.Constantes.PERSISTENCE_UNIT;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public final class PagosDAOImpl implements PagosDAO {

    /**
     * EntiyManager, que gestiona las operaciones realizadas.
     */
    @PersistenceContext(unitName = PERSISTENCE_UNIT)
    private final EntityManager entityManager;

    /**
     * Constructor, que inicializa el Entity Manager.
     */
    public PagosDAOImpl() {
        EntityManagerFactory managerFactory
                = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public Optional<Pago> get(final long id) {
        return Optional.ofNullable(entityManager.find(Pago.class, id));
    }

    @Override
    public List<Pago> getAll() {
        String queryJpql = "SELECT p FROM Pago p ";
        TypedQuery<Pago> typedQuery
                = entityManager.createQuery(queryJpql, Pago.class);

        return typedQuery.getResultList();
    }

    @Override
    public List<Pago> getAll(final ConfiguracionPaginado paginado) {
        String queryJpql = "SELECT p FROM Pago p ";
        TypedQuery<Pago> typedQuery
                = entityManager.createQuery(queryJpql, Pago.class);

        typedQuery.setFirstResult(paginado.getOffset());
        typedQuery.setMaxResults(paginado.getLimite());

        return typedQuery.getResultList();
    }

    @Override
    public Pago save(final Pago pago) throws PersistenciaException {
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
    public Pago update(final Pago t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pago delete(final Pago t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
