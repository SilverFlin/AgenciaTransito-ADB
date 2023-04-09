package org.itson.dominio;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Toled
 */
@Entity
@NamedQueries({
    @NamedQuery(
            name = "personaPorRFC",
            query = "select p from Persona p "
            + "where p.rfc like :rfc"
    ),
    @NamedQuery(
            name = "personasPorNombre",
            query = "select p from Persona p "
            + "where p.nombres like :nombre"
    ),
    @NamedQuery(
            name = "personasPorAnho",
            query = "select p from Persona p "
            + "where EXTRACT(YEAR p.fechaNacimiento) = :anho"
    )
})
public class Persona implements Serializable {

    /**
     * Longitud máxima por defecto para los atributos que serán varchar.
     */
    private static final int LONGITUD_DEFAULT = 100;

    /**
     * Longitud del RFC.
     */
    private static final int LONGITUD_RFC = 13;

    /**
     * Longitud del teléfono.
     */
    private static final int LONGITUD_TELEFONO = 10;

    /**
     * Llave principal, tipo de generación: Identidad.
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Columna RFC, con límite correspondiente al rfc, requerido.
     */
    @Column(name = "RFC", unique = true, nullable = false,
            length = LONGITUD_RFC)
    private String rfc;

    /**
     * Columna nombres, con límite default, requerido.
     */
    @Column(name = "nombres", nullable = false, length = LONGITUD_DEFAULT)
    private String nombres;

    /**
     * Columna apellidoPaterno, con límite default, requerido.
     */
    @Column(name = "apellidoPaterno", nullable = false,
            length = LONGITUD_DEFAULT)
    private String apellidoPaterno;

    /**
     * Columna apellidoMaterno, con límite default, opcional.
     */
    @Column(name = "apellidoMaterno", nullable = true,
            length = LONGITUD_DEFAULT)
    private String apellidoMaterno;

    /**
     * Columna fechaNacimiento, opcional.
     */
    @Column(name = "fechaNacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaNacimiento;

    /**
     * Columna telefono, límite de teléfono, opcional, con formato de telefono.
     */
    @Column(name = "telefono", nullable = true, length = LONGITUD_TELEFONO)
    private String telefono;

    /**
     * Vehículos relacionados, OneToMany.
     */
    @OneToMany(mappedBy = "duenho")
    private List<Vehiculo> vehiculos;

    /**
     * Trámites relacionados, OneToMany.
     */
    @OneToMany(mappedBy = "tramitante")
    private List<Tramite> tramites;

    /**
     * Constructor vacío.
     */
    public Persona() {
    }

    /**
     * Constructor que no incluye ID.
     *
     * @param rfc
     * @param nombres
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param fechaNacimiento
     * @param vehiculos
     * @param tramites
     */
    public Persona(
            final String rfc,
            final String nombres,
            final String apellidoPaterno,
            final String apellidoMaterno,
            final Calendar fechaNacimiento,
            final List<Vehiculo> vehiculos,
            final List<Tramite> tramites) {
        this.rfc = rfc;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.vehiculos = vehiculos;
        this.tramites = tramites;
    }
    
    /**
     * Constructor que no incluye ID, vehículos y trámites.
     *
     * @param rfc
     * @param nombres
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param fechaNacimiento
     */
    public Persona(
            final String rfc,
            final String nombres,
            final String apellidoPaterno,
            final String apellidoMaterno,
            final Calendar fechaNacimiento) {
        this.rfc = rfc;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
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
     * @return RFC de la persona.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     *
     * @param rfc
     */
    public void setRfc(final String rfc) {
        this.rfc = rfc;
    }

    /**
     *
     * @return Nombres de la persona.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     *
     * @param nombres
     */
    public void setNombres(final String nombres) {
        this.nombres = nombres;
    }

    /**
     *
     * @return Apellido Paterno de la persona.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     *
     * @param apellidoPaterno
     */
    public void setApellidoPaterno(final String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     *
     * @return Apellido Materno de la personal, si lo hay.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     *
     * @param apellidoMaterno
     */
    public void setApellidoMaterno(final String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     *
     * @return Fecha de nacimiento de la persona.
     */
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     *
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(final Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     *
     * @return Lista de vehículos asociados, si los hay.
     */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     *
     * @param vehiculos
     */
    public void setVehiculos(final List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     *
     * @return Lista de trámites asociados, si los hay.
     */
    public List<Tramite> getTramites() {
        return tramites;
    }

    /**
     *
     * @param tramites
     */
    public void setTramites(final List<Tramite> tramites) {
        this.tramites = tramites;
    }

    /**
     *
     * @return Teléfono con formato
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(final String telefono) {
        this.telefono = telefono;
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
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        return !((this.id == null && other.id != null)
                || (this.id != null && !this.id.equals(other.id)));
    }

    /**
     * Incluye los atributos de la clase, menos listas.
     *
     * @return Los atributos de la clase.
     */
    @Override
    public String toString() {
        return "Persona{"
                + "id=" + id
                + ", RFC=" + rfc
                + ", nombres=" + nombres
                + ", apellidoPaterno=" + apellidoPaterno
                + ", apellidoMaterno=" + apellidoMaterno
                + ", fechaNacimiento=" + fechaNacimiento.getTime()
                + ", telefono=" + telefono
                + '}';
    }

}
