package org.itson.dominio;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Toled
 */
@Entity
@DiscriminatorValue("licencia")
public class Placa extends Tramite {

    /**
     * Matrícula de la placa, con formato AAA-999, requerido y único.
     */
    @Column(name = "matricula", nullable = false, unique = true)
    private String matricula;

    /**
     * Fecha de emisión de la placa, requerido.
     */
    @Column(name = "fechaEmision", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaEmision;

    /**
     * Fecha de recepción de la placa, requerido.
     */
    @Column(name = "fechaRecepcion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaRecepcion;

    /**
     * Tipo de la plática, requerido.
     */
    @Column(name = "tipo", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoPlaca tipo;

    /**
     * Vehículo que contiene la placa.
     */
    @OneToOne(mappedBy = "placa")
    private Vehiculo vehiculo;

    /**
     * Constructor vacío.
     */
    public Placa() {
    }

    /**
     * Constructor que no incluye ID.
     *
     * @param matricula
     * @param fechaEmision
     * @param fechaRecepcion
     * @param tipo
     * @param vehiculo
     * @param costo
     * @param tramitante
     */
    public Placa(
            final String matricula,
            final Calendar fechaEmision,
            final Calendar fechaRecepcion,
            final TipoPlaca tipo,
            final Vehiculo vehiculo,
            final Double costo,
            final Persona tramitante
    ) {
        super(costo, tramitante);
        this.matricula = matricula;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.tipo = tipo;
        this.vehiculo = vehiculo;
    }

    /**
     *
     * @return matrícula con formato AAA-999.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @param matricula
     */
    public void setMatricula(final String matricula) {
        this.matricula = matricula;
    }

    /**
     *
     * @return fecha de emisión de la placa.
     */
    public Calendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     *
     * @param fechaEmision
     */
    public void setFechaEmision(final Calendar fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     *
     * @return fecha de recepción de la placa.
     */
    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     *
     * @param fechaRecepcion
     */
    public void setFechaRecepcion(final Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     *
     * @return Tipo de la placa.
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

    /**
     *
     * @return Vehículo a la que la placa pertenece.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     *
     * @param vehiculo
     */
    public void setVehiculo(final Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Agarra todos los parámetros de la padre, que no especifica la clase.
     *
     * @return los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Placa{"
                + super.toString()
                + "matricula=" + matricula
                + ", fechaEmision=" + fechaEmision
                + ", fechaRecepcion=" + fechaRecepcion
                + ", tipo=" + tipo + '}';
    }

}
