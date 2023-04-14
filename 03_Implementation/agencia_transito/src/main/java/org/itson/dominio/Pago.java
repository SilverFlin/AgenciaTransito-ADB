package org.itson.dominio;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Toled
 */
@Entity
public class Pago implements Serializable {

    /**
     * Llave principal, tipo de generación: Identidad.
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Columna fechaPago, requerido.
     */
    @Column(name = "fechaPago", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaPago;

    /**
     * Columna monto, requerido.
     */
    @Column(name = "monto", nullable = false)
    private Double monto;

    /**
     * Trámite relacionado, OneToOne.
     */
    @OneToOne(mappedBy = "pago", cascade = {CascadeType.PERSIST})
    private Tramite tramite;

    /**
     * Constructor vacío.
     */
    public Pago() {
    }

    /**
     * Constructor que no incluye ID.
     *
     * @param fechaPago
     * @param monto
     * @param tramite
     */
    public Pago(
            final Calendar fechaPago,
            final Double monto,
            final Tramite tramite
    ) {
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.tramite = tramite;
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
     * @return Fecha de pago.
     */
    public Calendar getFechaPago() {
        return fechaPago;
    }

    /**
     *
     * @param fechaPago
     */
    public void setFechaPago(final Calendar fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     *
     * @return Monto del pago.
     */
    public Double getMonto() {
        return monto;
    }

    /**
     *
     * @param monto
     */
    public void setMonto(final Double monto) {
        this.monto = monto;
    }

    /**
     *
     * @return Trámite relacionado.
     */
    public Tramite getTramite() {
        return tramite;
    }

    /**
     *
     * @param tramite
     */
    public void setTramite(final Tramite tramite) {
        this.tramite = tramite;
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
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        return !((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id)));
    }

    /**
     * Incluye los atributos de la clase.
     *
     * @return Los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Pago{" + "id=" + id
                + ", fechaPago=" + fechaPago
                + ", monto=" + monto
                + '}';
    }

}
