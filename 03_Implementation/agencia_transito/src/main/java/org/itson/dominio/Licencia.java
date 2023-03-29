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

    @Column(name = "fechaInicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaInicio;

    @Column(name = "fechaCaducidad", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaCaducidad;

    @Column(name = "anhosVigencia", nullable = false)
    private Integer anhosVigencia;

    @Column(name = "tipo", nullable = true)
    @Enumerated(EnumType.STRING)
    private TipoLicencia tipo;

    public Licencia() {
    }

    public Licencia(Calendar fechaInicio, Calendar fechaCaducidad, Integer anhosVigencia, TipoLicencia tipo, Double costo, Persona tramitante) {
        super(costo, tramitante);
        this.fechaInicio = fechaInicio;
        this.fechaCaducidad = fechaCaducidad;
        this.anhosVigencia = anhosVigencia;
        this.tipo = tipo;
    }

    public Licencia(Long id, Calendar fechaInicio, Calendar fechaCaducidad, Integer anhosVigencia, TipoLicencia tipo, Double costo, Persona tramitante) {
        super(id, costo, tramitante);
        this.fechaInicio = fechaInicio;
        this.fechaCaducidad = fechaCaducidad;
        this.anhosVigencia = anhosVigencia;
        this.tipo = tipo;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Calendar getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Calendar fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Integer getAnhosVigencia() {
        return anhosVigencia;
    }

    public void setAnhosVigencia(Integer anhosVigencia) {
        this.anhosVigencia = anhosVigencia;
    }

    public TipoLicencia getTipo() {
        return tipo;
    }

    public void setTipo(TipoLicencia tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Licencia{" + super.toString() + "fechaInicio=" + fechaInicio + ", fechaCaducidad=" + fechaCaducidad + ", anhosVigencia=" + anhosVigencia + ", tipo=" + tipo + '}';
    }

}
