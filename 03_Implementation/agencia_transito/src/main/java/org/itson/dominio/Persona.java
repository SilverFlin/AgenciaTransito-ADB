package org.itson.dominio;

import org.itson.utils.NombreConverter;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Convert;
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
 * @author Luis Toledo n Misael Marchena
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
    @Convert(converter = NombreConverter.class)
    @Column(name = "nombres", nullable = false, length = LONGITUD_DEFAULT)
    private String nombres;

    /**
     * Columna apellidoPaterno, con límite default, requerido.
     */
    @Convert(converter = NombreConverter.class)
    @Column(name = "apellidoPaterno", nullable = false,
            length = LONGITUD_DEFAULT)
    private String apellidoPaterno;

    /**
     * Columna apellidoMaterno, con límite default, opcional.
     */
    @Convert(converter = NombreConverter.class)
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
     * Constructor que no incluye ID, vehículos y trámites.
     *
     * @param rfc RFC de la persona.
     * @param nombres Nombres de la persona.
     * @param apellidoPaterno Apellido paterno de la persona.
     * @param apellidoMaterno Apellido materno de la persona.
     * @param fechaNacimiento Fecha de nacimiento de la persona.
     * @param telefono Teléfono de la persona.
     */
    public Persona(
            final String rfc,
            final String nombres,
            final String apellidoPaterno,
            final String apellidoMaterno,
            final Calendar fechaNacimiento,
            final String telefono) {
        this.rfc = rfc;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    /**
     * Regresa el ID de la persona.
     *
     * @return Llave primaria de la entidad.
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id id de la persona.
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * Regresa el ID de la persona.
     *
     * @return RFC de la persona.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     *
     * @param rfc rfc de la persona.
     */
    public void setRfc(final String rfc) {
        this.rfc = rfc;
    }

    /**
     * Regresa el ID de la persona.
     *
     * @return Nombres de la persona.
     */
    public String getNombres() {
        return nombres;
    }

    /**
     *
     * @param nombres nombres de la persona.
     */
    public void setNombres(final String nombres) {
        this.nombres = nombres;
    }

    /**
     * Regresa el ID de la persona.
     *
     * @return Apellido Paterno de la persona.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     *
     * @param apellidoPaterno apellido paterno de la persona
     */
    public void setApellidoPaterno(final String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Regresa el ID de la persona.
     *
     * @return Apellido Materno de la personal, si lo hay.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     *
     * @param apellidoMaterno apellido materno de la persona.
     */
    public void setApellidoMaterno(final String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Regresa el ID de la persona.
     *
     * @return Fecha de nacimiento de la persona.
     */
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     *
     * @param fechaNacimiento fecha de nacimiento de la persona.
     */
    public void setFechaNacimiento(final Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Regresa el ID de la persona.
     *
     * @return Lista de vehículos asociados, si los hay.
     */
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     *
     * @param vehiculos vehículos asociados.
     */
    public void setVehiculos(final List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Regresa el ID de la persona.
     *
     * @return Lista de trámites asociados, si los hay.
     */
    public List<Tramite> getTramites() {
        return tramites;
    }

    /**
     *
     * @param tramites tramites asociados.
     */
    public void setTramites(final List<Tramite> tramites) {
        this.tramites = tramites;
    }

    /**
     * Regresa el ID de la persona.
     *
     * @return Teléfono con formato
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono teléfono de la persona.
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
     * @param object Object
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
