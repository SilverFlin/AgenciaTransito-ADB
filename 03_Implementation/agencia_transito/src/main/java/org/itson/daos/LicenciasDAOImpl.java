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
import org.itson.interfaces.LicenciasDAO;
import org.itson.utils.ConfiguracionPaginado;
import static org.itson.utils.Constantes.PERSISTENCE_UNIT;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public final class LicenciasDAOImpl implements LicenciasDAO {

    /**
     * EntiyManager, que gestiona las operaciones realizadas.
     */
    @PersistenceContext(unitName = PERSISTENCE_UNIT)
    private final EntityManager entityManager;

    /**
     * Constructor, que inicializa el Entity Manager.
     */
    public LicenciasDAOImpl() {
        EntityManagerFactory managerFactory
                = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public Optional<Licencia> get(final long id) {
        return Optional.ofNullable(entityManager.find(Licencia.class, id));
    }

    @Override
    public List<Licencia> getAll() {
        String queryJpql = "SELECT l FROM Licencia l ";
        TypedQuery<Licencia> query
                = entityManager.createQuery(queryJpql, Licencia.class);

        return query.getResultList();
    }

    @Override
    public List<Licencia> getAll(final ConfiguracionPaginado paginado) {
        String queryJpql = "SELECT l FROM Licencia l ";
        TypedQuery<Licencia> typedQuery
                = entityManager.createQuery(queryJpql, Licencia.class);

        typedQuery.setFirstResult(paginado.getOffset());
        typedQuery.setMaxResults(paginado.getLimite());

        return typedQuery.getResultList();
    }

    @Override
    public Licencia save(final Licencia licencia) throws PersistenciaException {
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
    public Licencia update(final Licencia t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Licencia delete(final Licencia t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
