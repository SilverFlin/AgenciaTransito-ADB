package org.itson.dominio;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Toled
 */
@Entity
@DiscriminatorValue("licencia")
public class Licencia extends Tramite {

    /**
     * Fecha de inicio de la licencia, requerido.
     */
    @Column(name = "fechaInicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaInicio;

    /**
     * Fecha a la que la licencia caduca, requerido.
     */
    @Column(name = "fechaCaducidad", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaCaducidad;

    /**
     * Años por los que se solicitó la licencia, requerido.
     */
    @Column(name = "anhosVigencia", nullable = false)
    private Integer anhosVigencia;

    /**
     * Tipo de la licencia, guardado como String en la base de datos.
     */
    @Column(name = "tipo", nullable = true)
    @Enumerated(EnumType.STRING)
    private TipoLicencia tipo;

    /**
     * Constructor vacío.
     */
    public Licencia() {
    }

    /**
     * Constructor que no incluye ID ni pago.
     *
     * @param fechaInicio
     * @param fechaCaducidad
     * @param anhosVigencia
     * @param tipo
     * @param costo
     * @param tramitante
     */
    public Licencia(final Calendar fechaInicio,
            final Calendar fechaCaducidad,
            final Integer anhosVigencia,
            final TipoLicencia tipo,
            final Double costo,
            final Persona tramitante
    ) {
        super(costo, tramitante);
        this.fechaInicio = fechaInicio;
        this.fechaCaducidad = fechaCaducidad;
        this.anhosVigencia = anhosVigencia;
        this.tipo = tipo;
    }

    /**
     *
     * @return fecha inicio de la licencia.
     */
    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     *
     * @param fechaInicio
     */
    public void setFechaInicio(final Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     *
     * @return fecha en la que la licencia caduca.
     */
    public Calendar getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     *
     * @param fechaCaducidad
     */
    public void setFechaCaducidad(final Calendar fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     *
     * @return los años a los que la licencia se tramitó.
     */
    public Integer getAnhosVigencia() {
        return anhosVigencia;
    }

    /**
     *
     * @param anhosVigencia
     */
    public void setAnhosVigencia(final Integer anhosVigencia) {
        this.anhosVigencia = anhosVigencia;
    }

    /**
     *
     * @return Tipo de la licencia.
     */
    public TipoLicencia getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(final TipoLicencia tipo) {
        this.tipo = tipo;
    }

    /**
     * Agarra todos los parámetros de la padre, que no especifica la clase.
     *
     * @return los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Licencia{"
                + super.toString()
                + ", fechaInicio=" + fechaInicio
                + ", fechaCaducidad=" + fechaCaducidad
                + ", anhosVigencia=" + anhosVigencia
                + ", tipo=" + tipo + '}';
    }

}
