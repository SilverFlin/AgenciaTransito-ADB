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
import static org.itson.utils.Constantes.PERSISTENCE_UNIT;

/**
 *
 * @author Toled
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
        String codigoJPQL = "SELECT l FROM Licencia l ";
        TypedQuery<Licencia> query
                = entityManager.createQuery(codigoJPQL, Licencia.class);

        return query.getResultList();
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
    public Licencia update(final Licencia t, final String[] params) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Licencia delete(final Licencia t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public boolean validarLicenciaPersona(Long id){
        String codigoJPQL = "SELECT l FROM Licencia l WHERE l.idPersona LIKE %:id%";
        TypedQuery<Licencia> query = entityManager.createQuery(codigoJPQL, Licencia.class);
        query.setParameter("id", id);
        Licencia licencia = query.getSingleResult();
        if(licencia != null){
            return true;
        }
        return false;
    }
}
