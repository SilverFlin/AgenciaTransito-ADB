package org.itson.interfaces;

import java.util.List;
import java.util.Optional;
import org.itson.excepciones.PersistenciaException;
import org.itson.utils.ConfiguracionPaginado;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public interface DAO<T> {

    /**
     * Consigue el elemento de la base de datos según su ID.
     *
     * @param id
     * @return Un objecto opcional, del tipo del elemento.
     */
    Optional<T> get(long id);

    /**
     * Consigue una lista con todos los elementos en la base de datos.
     *
     * @return Lista de elemento T
     */
    List<T> getAll();

    /**
     * Consigue una lista con todos los elementos de la base de datos, dada una
     * configuración de paginado.
     *
     * @param paginado
     * @return Lista de elemento T.
     */
    List<T> getAll(ConfiguracionPaginado paginado);

    /**
     * Persiste el elemento en la base de datos.
     *
     * @param t
     * @return El elemento guardado
     * @throws PersistenciaException
     */
    T save(T t) throws PersistenciaException;

    /**
     * Actualiza el elemento de la base de datos.
     *
     * @param t
     * @return El elemento actualizado.
     */
    T update(T t) throws PersistenciaException;

    /**
     * Elimina el elemento de la base de datos según una ID dada.
     *
     * @param t
     * @return El elemento eliminado.
     */
    T delete(T t);
}
