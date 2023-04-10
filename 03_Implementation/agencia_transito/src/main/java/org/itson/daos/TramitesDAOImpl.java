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
import static org.itson.utils.Constantes.PERSISTENCE_UNIT;

/**
 *
 * @author Toled
 */
public final class TramitesDAOImpl implements TramitesDAO {

    /**
     * EntiyManager, que gestiona las operaciones realizadas.
     */
    @PersistenceContext(unitName = PERSISTENCE_UNIT)
    private final EntityManager entityManager;

    /**
     * Constructor, que inicializa el Entity Manager.
     */
    public TramitesDAOImpl() {
        EntityManagerFactory managerFactory
                = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public Optional<Tramite> get(final long id) {
        return Optional.ofNullable(entityManager.find(Tramite.class, id));
    }

    @Override
    public List<Tramite> getAll() {
        String codigoJPQL = "SELECT t FROM Tramite t ";
        TypedQuery<Tramite> query
                = entityManager.createQuery(codigoJPQL, Tramite.class);

        return query.getResultList();
    }

    @Override
    public List<Tramite> getAll(final ParametrosTramitesDTO filtros) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Tramite save(final Tramite tramite) throws PersistenciaException {
        String msgError = "No se pueden guardar registros de Tramite";
        throw new PersistenciaException(msgError);
    }

    @Override
    public Tramite update(final Tramite t, final String[] params) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Tramite delete(final Tramite t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
