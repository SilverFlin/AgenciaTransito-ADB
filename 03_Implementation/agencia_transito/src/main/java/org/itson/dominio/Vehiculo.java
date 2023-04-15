package org.itson.dominio;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Luis Toledo & Misael Marchena
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
     * Historial de placas.
     */
    @OneToMany(mappedBy = "vehiculoPasado")
    private List<Placa> historialPlacas;

    /**
     * Constructor vacío.
     */
    public Vehiculo() {
    }

    /**
     * Constructor que no incluye ID, placa, ni historial de placa.
     *
     * @param duenho Dueño del vehículo.
     * @param numeroSerie Número de serie.
     * @param linea Línea.
     * @param marca Marca.
     * @param modelo Modelo.
     * @param color Color.
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
     * Regresa el id del vehículo.
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
     * Regresa el id del vehículo.
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
     * Regresa el id del vehículo.
     * 
     * @return Clase Placa asociada al vehículo.
     */
    public Placa getPlaca() {
        return placa;
    }

    /**
     * Establece la placa del vehículo.
     * 
     * @param placa Placa que se establecerá.
     */
    public void setPlaca(final Placa placa) {
        this.placa = placa;
    }

    /**
     * Regresa el número de serie del vehículo.
     * 
     * @return Número serie.
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * Establece el número de serie del vehículo.
     * 
     * @param numeroSerie Número de serie a establecer.
     */
    public void setNumeroSerie(final String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * Regresa la línea del vehículo.
     * 
     * @return Linea del vehículo, e.g. Aveo.
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Establece la línea del vehículo.
     * 
     * @param linea Línea a establecer.
     */
    public void setLinea(final String linea) {
        this.linea = linea;
    }

    /**
     * Regresa la marca del vehículo.
     * 
     * @return Marca del vehículo, e.g. Chevrolet.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     * 
     * @param marca Marca a establecer.
     */
    public void setMarca(final String marca) {
        this.marca = marca;
    }

    /**
     * Regresa el modelo del vehículo.
     * 
     * @return Modelo del vehiculo, e.g. 2019
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo del vehículo.
     * 
     * @param modelo Modelo a establecer.
     */
    public void setModelo(final String modelo) {
        this.modelo = modelo;
    }

    /**
     * Regresa el color del vehículo.
     * 
     * @return Color del vehículo, e.g. Rojo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del vehículo.
     * 
     * @param color Color a establecer.
     */
    public void setColor(final String color) {
        this.color = color;
    }

    /**
     * Regresa el historial de placas del vehículo.
     * 
     * @return el historial de placas, si las hay, o nulo.
     */
    public List<Placa> getHistorialPlacas() {
        return historialPlacas;
    }

    /**
     * Establece el historial de placas del vehículo.
     * 
     * @param historialPlacas Historial de placas a establecer.
     */
    public void setHistorialPlacas(final List<Placa> historialPlacas) {
        this.historialPlacas = historialPlacas;
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
