package org.itson.dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Toled
 */
@Entity
@DiscriminatorValue("automovil")
public class Automovil extends Vehiculo {

    /**
     * Constructor vacío.
     */
    public Automovil() {
    }

    /**
     * Constructor que no incluye ID, placa, ni historial de placa.
     *
     * @param duenho
     * @param numeroSerie
     * @param linea
     * @param marca
     * @param modelo
     * @param color
     */
    public Automovil(
            final Persona duenho,
            final String numeroSerie,
            final String linea,
            final String marca,
            final String modelo,
            final String color
    ) {
        super(duenho, numeroSerie, linea, marca, modelo, color);
    }

    /**
     * Agarra todos los parámetros de la padre, que no especifica la clase.
     *
     * @return los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Automovil{" + super.toString() + '}';
    }

}
