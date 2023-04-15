package org.itson.interfaces;

import java.util.Optional;
import org.itson.dominio.Vehiculo;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public interface VehiculosDAO extends DAO<Vehiculo> {

    /**
     * Consigue el vehículo de la base de datos según su matricula.
     *
     * @param matricula matrícula del vehículo
     * @return El vehículo si se encontró.
     */
    Optional<Vehiculo> getByMatricula(String matricula);
}
