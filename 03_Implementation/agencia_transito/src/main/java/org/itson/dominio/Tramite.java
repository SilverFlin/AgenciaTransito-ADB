package org.itson.dominio;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Toled
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Tramite implements Serializable {

    /**
     * Llave principal, tipo de generación: Identidad.
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Fecha de inicio del tramite, requerido.
     */
    @Column(name = "fechaInicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaInicio;

    /**
     * Columna costo, requerido.
     */
    @Column(name = "costo", nullable = false)
    private Double costo;

    /**
     * Llave foránea, ManyToOne, requerido.
     */
    @ManyToOne
    @JoinColumn(name = "idPersona", nullable = false)
    private Persona tramitante;

    /**
     * Llave foránea, OneToOne, requerido.
     */
    @OneToOne
    @JoinColumn(name = "idPago", referencedColumnName = "id")
    private Pago pago;

    /**
     * Constructor vacío.
     */
    public Tramite() {
    }

    /**
     * Constructor que no incluye ID.
     *
     * @param costo
     * @param tramitante
     * @param fechaInicio
     */
    public Tramite(
            final Double costo,
            final Persona tramitante,
            final Calendar fechaInicio
    ) {
        this.costo = costo;
        this.tramitante = tramitante;
        this.fechaInicio = fechaInicio;
    }

    /**
     *
     * @return Llave primaria de la entidad.
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     *
     * @return fecha inicio del tramite.
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
     * @return Costo del tramite.
     */
    public Double getCosto() {
        return costo;
    }

    /**
     *
     * @param costo
     */
    public void setCosto(final Double costo) {
        this.costo = costo;
    }

    /**
     *
     * @return Clase Persona, que representa al tramitante.
     */
    public Persona getTramitante() {
        return tramitante;
    }

    /**
     *
     * @param tramitante
     */
    public void setTramitante(final Persona tramitante) {
        this.tramitante = tramitante;
    }

    /**
     *
     * @return Pago relacionado al tramite, si lo hay.
     */
    public Pago getPago() {
        return pago;
    }

    /**
     *
     * @param pago
     */
    public void setPago(final Pago pago) {
        this.pago = pago;
    }

    /**
     * hashcode por defecto.
     *
     * @return hashcode.
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * equals por defecto.
     *
     * @param object
     * @return Si las entidades son iguales.
     */
    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Tramite)) {
            return false;
        }
        Tramite other = (Tramite) object;
        return !((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id)));
    }

    /**
     * Incluye los atributos menos la especificacion de la clase, ya que hereda.
     *
     * @return los atributos de la clase.
     */
    @Override
    public String toString() {
        return " id=" + id
                + ", costo=" + costo
                + ", tramitante=" + tramitante.getRfc()
                + ", fechaInicio=" + fechaInicio.toString();
    }

}
