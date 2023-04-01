package org.itson.interfaces;

import org.itson.dominio.Vehiculo;

/**
 *
 * @author Toled
 */
public interface VehiculosDAO extends DAO<Vehiculo> {

    /**
     * Consigue el vehículo de la base de datos según su matricula.
     *
     * @param matricula
     * @return El vehículo si se encontró.
     */
    Vehiculo getByMatricula(String matricula);
}
