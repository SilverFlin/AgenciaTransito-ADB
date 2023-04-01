package org.itson.dominio;

import java.io.Serializable;
import java.util.Calendar;
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

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fechaPago", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaPago;

    @Column(name = "monto", nullable = false)
    private Double monto;

    @OneToOne(mappedBy = "pago")
    private Tramite tramite;

    public Pago() {
    }

    public Pago(Calendar fechaPago, Double monto, Tramite tramite) {
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.tramite = tramite;
    }

    public Pago(Long id, Calendar fechaPago, Double monto, Tramite tramite) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.monto = monto;
        this.tramite = tramite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Calendar fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Tramite getTramite() {
        return tramite;
    }

    public void setTramite(Tramite tramite) {
        this.tramite = tramite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pago{" + "id=" + id + ", fechaPago=" + fechaPago + ", monto=" + monto + '}';
    }

}
