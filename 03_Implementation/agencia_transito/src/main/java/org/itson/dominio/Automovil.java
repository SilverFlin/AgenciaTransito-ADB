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

    public Automovil() {
    }

    public Automovil(Persona duenho, Placa placa, String numeroSerie, String linea, String marca, String modelo, String color) {
        super(duenho, placa, numeroSerie, linea, marca, modelo, color);
    }

    public Automovil(Long id, Persona duenho, Placa placa, String numeroSerie, String linea, String marca, String modelo, String color) {
        super(id, duenho, placa, numeroSerie, linea, marca, modelo, color);
    }

    @Override
    public String toString() {
        return "Automovil{" + super.toString() + '}';
    }

}
