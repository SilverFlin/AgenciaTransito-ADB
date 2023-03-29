package org.itson.dominio;

import java.io.Serializable;
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

/**
 *
 * @author Toled
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehiculo implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @Column(name = "idPersona", nullable = false)
    private Persona duenho;

    @OneToOne
    @JoinColumn(name = "idPlaca", referencedColumnName = "id")
    private Placa placa;

    @Column(name = "numeroSerie", nullable = false, length = 100)
    private String numeroSerie;

    @Column(name = "linea", nullable = false, length = 100)
    private String linea;

    @Column(name = "marca", nullable = false, length = 100)
    private String marca;

    @Column(name = "modelo", nullable = false, length = 100)
    private String modelo;

    @Column(name = "color", nullable = false, length = 100)
    private String color;

    public Vehiculo() {
    }

    public Vehiculo(Persona duenho, Placa placa, String numeroSerie, String linea, String marca, String modelo, String color) {
        this.duenho = duenho;
        this.placa = placa;
        this.numeroSerie = numeroSerie;
        this.linea = linea;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Vehiculo(Long id, Persona duenho, Placa placa, String numeroSerie, String linea, String marca, String modelo, String color) {
        this.id = id;
        this.duenho = duenho;
        this.placa = placa;
        this.numeroSerie = numeroSerie;
        this.linea = linea;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Persona getDuenho() {
        return duenho;
    }

    public void setDuenho(Persona duenho) {
        this.duenho = duenho;
    }

    public Placa getPlaca() {
        return placa;
    }

    public void setPlaca(Placa placa) {
        this.placa = placa;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        if (!(object instanceof Vehiculo)) {
            return false;
        }
        Vehiculo other = (Vehiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id=" + id + ", duenho=" + duenho.getRFC() + ", placa=" + placa.getMatricula() + ", numeroSerie=" + numeroSerie + ", linea=" + linea + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color;
    }

}
