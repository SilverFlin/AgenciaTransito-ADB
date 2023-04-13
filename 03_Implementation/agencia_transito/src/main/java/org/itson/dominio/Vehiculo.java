package org.itson.dominio;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author Toled
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NamedQueries({
    @NamedQuery(
            name = "vehiculoPorMatricula",
            query = "SELECT v FROM Vehiculo v WHERE "
            + "v.placa.matricula = :matricula"
    )
})

//
public class Vehiculo implements Serializable {

    /**
     * Longitud máxima por defecto para los atributos que serán varchar.
     */
    private static final int LONGITUD_DEFAULT = 100;

    /**
     * Llave principal, tipo de generación: Identidad.
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Llave foránea, ManyToOne, requerido.
     */
    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idPersona", nullable = false)
    private Persona duenho;

    /**
     * Llave foránea,OneToOne, no es requerido.
     */
    @OneToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idPlaca", referencedColumnName = "id", nullable = true)
    private Placa placa;

    /**
     * Columna numeroSerie, con límite default, requerido.
     */
    @Column(name = "numeroSerie", nullable = false, length = LONGITUD_DEFAULT)
    private String numeroSerie;

    /**
     * Columna linea, con límite default, requerido.
     */
    @Column(name = "linea", nullable = false, length = LONGITUD_DEFAULT)
    private String linea;

    /**
     * Columna linea, marca con límite de 100 caracteres, requerido.
     */
    @Column(name = "marca", nullable = false, length = LONGITUD_DEFAULT)
    private String marca;

    /**
     * Columna linea, modelo con límite de 100 caracteres, requerido.
     */
    @Column(name = "modelo", nullable = false, length = LONGITUD_DEFAULT)
    private String modelo;

    /**
     * Columna linea, color con límite de 100 caracteres, requerido.
     */
    @Column(name = "color", nullable = false, length = LONGITUD_DEFAULT)
    private String color;

    /**
     * Constructor vacío.
     */
    public Vehiculo() {
    }

    /**
     * Constructor que no incluye ID.
     *
     * @param duenho
     * @param placa
     * @param numeroSerie
     * @param linea
     * @param marca
     * @param modelo
     * @param color
     */
    public Vehiculo(
            final Persona duenho,
            final Placa placa,
            final String numeroSerie,
            final String linea,
            final String marca,
            final String modelo,
            final String color
    ) {
        this.duenho = duenho;
        this.placa = placa;
        this.numeroSerie = numeroSerie;
        this.linea = linea;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    /**
     * Constructor que no incluye ID ni placa.
     *
     * @param duenho
     * @param numeroSerie
     * @param linea
     * @param marca
     * @param modelo
     * @param color
     */
    public Vehiculo(
            final Persona duenho,
            final String numeroSerie,
            final String linea,
            final String marca,
            final String modelo,
            final String color
    ) {
        this.duenho = duenho;
        this.numeroSerie = numeroSerie;
        this.linea = linea;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
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
     * @return Clase Persona que representa al dueño del vehículo.
     */
    public Persona getDuenho() {
        return duenho;
    }

    /**
     *
     * @param duenho
     */
    public void setDuenho(final Persona duenho) {
        this.duenho = duenho;
    }

    /**
     *
     * @return Clase Placa asociada al vehículo.
     */
    public Placa getPlaca() {
        return placa;
    }

    /**
     *
     * @param placa
     */
    public void setPlaca(final Placa placa) {
        this.placa = placa;
    }

    /**
     *
     * @return Número serie.
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     *
     * @param numeroSerie
     */
    public void setNumeroSerie(final String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     *
     * @return Linea del vehículo, e.g. Aveo.
     */
    public String getLinea() {
        return linea;
    }

    /**
     *
     * @param linea
     */
    public void setLinea(final String linea) {
        this.linea = linea;
    }

    /**
     *
     * @return Marca del vehículo, e.g. Chevrolet.
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(final String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return Modelo del vehiculo, e.g. 2019
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(final String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return Color del vehículo, e.g. Rojo.
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(final String color) {
        this.color = color;
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
        if (!(object instanceof Vehiculo)) {
            return false;
        }

        Vehiculo other = (Vehiculo) object;
        return !((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id)));

    }

    /**
     * Incluye los atributos menos la especificacion de la clase, ya que hereda.
     *
     * @return Los atributos de la clase.
     */
    @Override
    public String toString() {
        return "id=" + id
                + ", duenho=" + duenho.getRfc()
                + ", numeroSerie=" + numeroSerie
                + ", linea=" + linea
                + ", marca=" + marca
                + ", modelo=" + modelo
                + ", color=" + color;
    }

}
