package org.itson.interfaces;

import java.util.List;
import java.util.Optional;
import org.itson.dominio.Persona;
import org.itson.utils.ConfiguracionPaginado;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public interface PersonasDAO extends DAO<Persona> {

    /**
     * Consigue la persona de la base de datos según su RFC.
     *
     * @param rfc
     * @return La persona si se encontró.
     */
    Optional<Persona> getByRFC(String rfc);

    /**
     * Consigue las personas de la base de datos que coincidan con el nombre.
     *
     * @param nombre
     * @param paginado
     * @return Lista de personas que coincidieron.
     */
    List<Persona> getByNombre(String nombre, ConfiguracionPaginado paginado);

    /**
     * Consigue las personas de la base de datos que coincidan con el año de
     * nacimiento.
     *
     * @param anho
     * @param paginado
     * @return Lista de personas que coincidieron.
     */
    List<Persona> getByAnho(int anho, ConfiguracionPaginado paginado);

}
