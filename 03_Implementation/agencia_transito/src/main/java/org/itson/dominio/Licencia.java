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
 * @author Luis Toledo n Misael Marchena
 */
@Entity
@DiscriminatorValue("licencia")
public class Licencia extends Tramite {

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
     * @param fechaInicio Fecha en que se creó la licencia.
     * @param fechaCaducidad Fecha de caducidad de la licencia.
     * @param anhosVigencia Años de vigencia de la licencia.
     * @param tipo Tipo de la licencia.
     * @param costo Costo de la licencia.
     * @param tramitante Tramitante de la licencia.
     */
    public Licencia(
            final Calendar fechaInicio,
            final Calendar fechaCaducidad,
            final Integer anhosVigencia,
            final TipoLicencia tipo,
            final Double costo,
            final Persona tramitante
    ) {
        super(costo, tramitante, fechaInicio);
        this.fechaCaducidad = fechaCaducidad;
        this.anhosVigencia = anhosVigencia;
        this.tipo = tipo;
    }

    /**
     * Regresa la fecha de caducidad.
     * 
     * @return fecha en la que la licencia caduca.
     */
    public Calendar getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Establece la fecha de caducidad.
     * 
     * @param fechaCaducidad Fecha de caducidad a establecer.
     */
    public void setFechaCaducidad(final Calendar fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Regresa los años de vigencia.
     * 
     * @return los años a los que la licencia se tramitó.
     */
    public Integer getAnhosVigencia() {
        return anhosVigencia;
    }

    /**
     * Establece los años de vigencia.
     * 
     * @param anhosVigencia Años de vigencia a establecer.
     */
    public void setAnhosVigencia(final Integer anhosVigencia) {
        this.anhosVigencia = anhosVigencia;
    }

    /**
     * Regresa el tipo de la licencia.
     * 
     * @return Tipo de la licencia.
     */
    public TipoLicencia getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de la licencia.
     * 
     * @param tipo Tipo que se establecerá.
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
                + ", fechaCaducidad=" + fechaCaducidad
                + ", anhosVigencia=" + anhosVigencia
                + ", tipo=" + tipo + '}';
    }

}
