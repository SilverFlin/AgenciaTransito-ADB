package org.itson.interfaces;

import java.util.Optional;
import org.itson.dominio.Vehiculo;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public interface VehiculosDAO extends DAO<Vehiculo> {

    /**
     * Consigue el vehículo de la base de datos según su matricula.
     *
     * @param matricula
     * @return El vehículo si se encontró.
     */
    Optional<Vehiculo> getByMatricula(String matricula);
}
