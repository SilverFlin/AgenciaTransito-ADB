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

    @Column(name = "matricula", nullable = false, unique = true)
    private String matricula;

    @Column(name = "fechaEmision", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaEmision;

    @Column(name = "fechaRecepcion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaRecepcion;

    @Column(name = "tipo", nullable = true)
    @Enumerated(EnumType.STRING)
    private TipoPlaca tipo;

    @OneToOne(mappedBy = "vehiculo")
    private Vehiculo vehiculo;

    public Placa() {
    }

    public Placa(String matricula, Calendar fechaEmision, Calendar fechaRecepcion, TipoPlaca tipo, Double costo, Persona tramitante) {
        super(costo, tramitante);
        this.matricula = matricula;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.tipo = tipo;
    }

    public Placa(Long id, String matricula, Calendar fechaEmision, Calendar fechaRecepcion, TipoPlaca tipo, Double costo, Persona tramitante) {
        super(id, costo, tramitante);
        this.matricula = matricula;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Calendar getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Calendar fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Calendar getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Calendar fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public TipoPlaca getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlaca tipo) {
        this.tipo = tipo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Placa{" + super.toString() + "matricula=" + matricula + ", fechaEmision=" + fechaEmision + ", fechaRecepcion=" + fechaRecepcion + ", tipo=" + tipo + '}';
    }

}
