package org.itson.presentacion;

import org.itson.dominio.Persona;
import org.itson.dominio.TipoPlaca;
import org.itson.dominio.Vehiculo;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public class ConfirmacionPlacasDTO {

    /**
     * Vehiculo asociado a las placas.
     */
    private Vehiculo automovil;
    /**
     * Persona asociada a las placas.
     */
    private Persona persona;
    /**
     * Costo de las placas, en MXN.
     */
    private double costo;
    /**
     * Tipo de las placas.
     */
    private TipoPlaca tipo;

    /**
     * Constructor vacío.
     */
    public ConfirmacionPlacasDTO() {
    }

    /**
     * Constructor con todos lo necesario.
     *
     * @param automovil Automóvil de la placa.
     * @param persona Dueño del automóvil con la placa.
     * @param costo Costo de la placa.
     * @param tipo Tipo de la placa.
     */
    public ConfirmacionPlacasDTO(
            final Vehiculo automovil,
            final Persona persona,
            final double costo,
            final TipoPlaca tipo
    ) {
        this.automovil = automovil;
        this.persona = persona;
        this.costo = costo;
        this.tipo = tipo;
    }

    /**
     * Regresa un objeto de tipo Vehiculo del automóvil.
     *
     * @return automovil.
     */
    public Vehiculo getAutomovil() {
        return automovil;
    }

    /**
     * Establece el automóvil.
     *
     * @param automovil Automovil
     */
    public void setAutomovil(final Vehiculo automovil) {
        this.automovil = automovil;
    }

    /**
     * Regresa un objeto de tipo Persona.
     *
     * @return tramitante
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Establece la persona.
     *
     * @param persona Persona
     */
    public void setPersona(final Persona persona) {
        this.persona = persona;
    }

    /**
     * Regresa el costo.
     *
     * @return costo, en MXN.
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Establece el costo.
     *
     * @param costo costo de las placas.
     */
    public void setCosto(final double costo) {
        this.costo = costo;
    }

    /**
     * Regresa el tipo de placa.
     *
     * @return tipo de placa.
     */
    public TipoPlaca getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo.
     *
     * @param tipo tipo de la placa.
     */
    public void setTipo(final TipoPlaca tipo) {
        this.tipo = tipo;
    }

}
