package org.itson.daos;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.itson.dominio.Persona;
import org.itson.excepciones.PersistenciaException;
import org.itson.interfaces.PersonasDAO;
import static org.itson.utils.Constantes.PERSISTENCE_UNIT;

/**
 *
 * @author Toled
 */
public final class PersonasDAOImpl implements PersonasDAO {

    /**
     * EntiyManager, que gestiona las operaciones realizadas.
     */
    @PersistenceContext(unitName = PERSISTENCE_UNIT)
    private final EntityManager entityManager;

    /**
     * Constructor, que inicializa el Entity Manager.
     */
    public PersonasDAOImpl() {
        EntityManagerFactory managerFactory
                = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public Optional<Persona> get(final long id) {
        return Optional.ofNullable(entityManager.find(Persona.class, id));
    }

    @Override
    public Optional<Persona> getByRFC(final String rfc) {
        TypedQuery<Persona> query
                = entityManager.createNamedQuery(
                        "personaPorRFC",
                        Persona.class);
        query.setParameter("rfc", rfc);
        Persona persona = null;
        try {
            persona = (Persona) query.getSingleResult();
        } catch (NoResultException e) {
            // No hace falta hacer nada.
        }

        return Optional.ofNullable(persona);
    }

    @Override
    public List<Persona> getByNombre(final String nombre) {
        TypedQuery<Persona> query
                = entityManager.createNamedQuery(
                        "personasPorNombre",
                        Persona.class);
        query.setParameter("nombre", "%" + nombre + "%");

        return query.getResultList();

    }

    @Override
    public List<Persona> getByAnho(final int anho) {
        TypedQuery<Persona> query
                = entityManager.createNamedQuery(
                        "personasPorAnho",
                        Persona.class);
        query.setParameter("anho", anho);

        return query.getResultList();
    }

    @Override
    public List<Persona> getAll() {
        TypedQuery<Persona> query
                = entityManager.createQuery("SELECT p FROM Persona p", Persona.class);
        return query.getResultList();
    }

    @Override
    public Persona save(final Persona persona) throws PersistenciaException {
        try {
            entityManager.getTransaction().begin();

            entityManager.persist(persona);

            entityManager.getTransaction().commit();
            return persona;
        } catch (Exception e) {
            throw new PersistenciaException("Error al guardar persona");
        }
    }

    @Override
    public Persona update(final Persona t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Persona delete(final Persona t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
