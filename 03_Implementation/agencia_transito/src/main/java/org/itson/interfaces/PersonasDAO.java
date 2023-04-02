package org.itson.interfaces;

import java.util.List;
import org.itson.dominio.Persona;

/**
 *
 * @author Toled
 */
public interface PersonasDAO extends DAO<Persona> {

    /**
     * Consigue la persona de la base de datos según su RFC.
     *
     * @param rfc
     * @return La persona si se encontró.
     */
    Persona getByRFC(String rfc);

    /**
     * Consigue las personas de la base de datos que coincidan con el nombre.
     *
     * @param nombre
     * @return Lista de personas que coincidieron.
     */
    List<Persona> getByNombre(String nombre);

    /**
     * Consigue las personas de la base de datos que coincidan con el año de
     * nacimiento.
     *
     * @param anho
     * @return Lista de personas que coincidieron.
     */
    List<Persona> getByAnho(int anho);

}
