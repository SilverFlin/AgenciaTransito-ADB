package org.itson.presentacion;

import org.itson.dominio.Persona;
import org.itson.dominio.TipoPlaca;
import org.itson.dominio.Vehiculo;

/**
 *
 * @author Toled
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
     * @param automovil
     * @param persona
     * @param costo
     * @param tipo
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
     *
     * @return automovil.
     */
    public Vehiculo getAutomovil() {
        return automovil;
    }

    /**
     *
     * @param automovil
     */
    public void setAutomovil(final Vehiculo automovil) {
        this.automovil = automovil;
    }

    /**
     *
     * @return tramitante
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     *
     * @param persona
     */
    public void setPersona(final Persona persona) {
        this.persona = persona;
    }

    /**
     *
     * @return costo, en MXN.
     */
    public double getCosto() {
        return costo;
    }

    /**
     *
     * @param costo
     */
    public void setCosto(final double costo) {
        this.costo = costo;
    }

    /**
     *
     * @return tipo de placa.
     */
    public TipoPlaca getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(final TipoPlaca tipo) {
        this.tipo = tipo;
    }

}
