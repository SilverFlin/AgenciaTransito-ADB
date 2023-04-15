package org.itson.dominio;

import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Luis Toledo & Misael Marchena
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
     * Vehículo que contiene la placa activa.
     */
    @OneToOne(mappedBy = "placa",
            cascade = {CascadeType.MERGE})
    private Vehiculo vehiculo;

    /**
     * Estado de la placa, que puede estar activada o no.
     */
    @Column(name = "estado", nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoPlaca estado;

    /**
     * Vehiculo al que pertenenció la placa.
     */
    @ManyToOne
    @JoinColumn(name = "idVehiculo", nullable = true)
    private Vehiculo vehiculoPasado;

    /**
     * Constructor vacío.
     */
    public Placa() {
    }

    /**
     * Constructor que no incluye ID, estado, ni vehiculo pasado.
     *
     * @param matricula Matrícula de la placa.
     * @param fechaInicio Fecha de realización de la placa.
     * @param fechaRecepcion Fecha de recepción de la placa.
     * @param tipo Tipo de la placa.
     * @param vehiculo Vehículo con la placa.
     * @param costo Costo de la placa.
     * @param tramitante Tramitante de la placa.
     */
    public Placa(
            final String matricula,
            final Calendar fechaInicio,
            final Calendar fechaRecepcion,
            final TipoPlaca tipo,
            final Vehiculo vehiculo,
            final Double costo,
            final Persona tramitante
    ) {
        super(costo, tramitante, fechaInicio);
        this.matricula = matricula;
        this.fechaRecepcion = fechaRecepcion;
        this.tipo = tipo;
        this.vehiculo = vehiculo;
    }

    /**
     * Regresa la matrícula de la placa.
     * 
     * @return matrícula con formato AAA-999.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula de la placa.
     * 
     * @param matricula Matrícula a establecer.
     */
    public void setMatricula(final String matricula) {
        this.matricula = matricula;
    }

    /**
     * Regresa la matrícula de la placa.
     * 
     * @return fecha de recepción de la placa.
     */
    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Establece la fecha de recepción de la placa.
     * 
     * @param fechaRecepcion Fecha de recepción a establecer.
     */
    public void setFechaRecepcion(final Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Regresa la matrícula de la placa.
     * 
     * @return Tipo de la placa.
     */
    public TipoPlaca getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de la placa.
     * 
     * @param tipo Tipo a establecer.
     */
    public void setTipo(final TipoPlaca tipo) {
        this.tipo = tipo;
    }

    /**
     * Regresa la matrícula de la placa.
     * 
     * @return Vehículo a la que la placa pertenece.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece vehículo de la placa.
     * 
     * @param vehiculo Vehículo a establecer.
     */
    public void setVehiculo(final Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Regresa la matrícula de la placa.
     * 
     * @return el estado de la placa.
     */
    public EstadoPlaca getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la placa.
     * 
     * @param estado Estado de la placa a establecer.
     */
    public void setEstado(final EstadoPlaca estado) {
        this.estado = estado;
    }

    /**
     * Regresa la matrícula de la placa.
     * 
     * @return Vehiculo al que perteneció la placa.
     */
    public Vehiculo getVehiculoPasado() {
        return vehiculoPasado;
    }

    /**
     * Establece el vehículo pasado de la placa.
     * 
     * @param vehiculoPasado 
     */
    public void setVehiculoPasado(final Vehiculo vehiculoPasado) {
        this.vehiculoPasado = vehiculoPasado;
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
                + ", fechaRecepcion=" + fechaRecepcion
                + ", tipo=" + tipo
                + ", estado=" + estado + '}';
    }

}
