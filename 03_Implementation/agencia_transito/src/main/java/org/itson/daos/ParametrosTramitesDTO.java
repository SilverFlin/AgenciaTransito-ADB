package org.itson.daos;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.itson.dominio.Licencia;
import org.itson.dominio.Placa;
import org.itson.dominio.Tramite;
import org.itson.utils.Periodo;

/**
 *
 * @author Toled
 */
public class ParametrosTramitesDTO {

    /**
     * Periodo al que pertenece la realizacion del tramite.
     */
    private Periodo periodo;
    /**
     * Tipo del Tramite. Licencia, placa, ...
     */
    private TipoTramite tipoTramite;
    /**
     * Nombre del tramitante, no incluye apellidos y no es necesario que sea un
     * nombre completo.
     */
    private String nombreTramitante;

    /**
     * Enum TipoTramite. TODO(Luis): Mover Enum
     */
    public enum TipoTramite {
        LICENCIA,
        PLACA
    }

    /**
     * Constructor con todos los filtros.
     *
     * @param periodo
     * @param tipoTramite
     * @param nombreTramitante
     */
    public ParametrosTramitesDTO(
            final Periodo periodo,
            final TipoTramite tipoTramite,
            final String nombreTramitante
    ) {
        this.periodo = periodo;
        this.tipoTramite = tipoTramite;
        this.nombreTramitante = nombreTramitante;
    }

    /**
     * Constructor vacío.
     */
    public ParametrosTramitesDTO() {
    }

    /**
     *
     * @return Parametro periodo del filtro, si lo hay.
     */
    public Periodo getPeriodo() {
        return periodo;
    }

    /**
     *
     * @param periodo
     */
    public void setPeriodo(final Periodo periodo) {
        this.periodo = periodo;
    }

    /**
     *
     * @return Tipo del trámite del filtro, si lo hay.
     */
    public TipoTramite getTipoTramite() {
        return tipoTramite;
    }

    /**
     *
     * @param tipoTramite
     */
    public void setTipoTramite(final TipoTramite tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    /**
     *
     * @return Nombre parcial del tramitante, si lo hay.
     */
    private String getNombreTramitante() {
        return nombreTramitante;
    }

    /**
     *
     * @param nombreTramitante
     */
    public void setNombreTramitante(final String nombreTramitante) {
        this.nombreTramitante = nombreTramitante;
    }

    public List<Predicate> getPredicados(CriteriaBuilder builder, Root<Tramite> root) {
        List<Predicate> predicados = new LinkedList<>();

        if (this.getNombreTramitante() != null && !this.getNombreTramitante().isBlank()) {
            Expression<String> nombresTramitante = root.get("tramitante").get("nombres");
            
            
            Predicate predicadoNombre = builder.like(nombresTramitante, "%" + this.getNombreTramitante() + "%");
            predicados.add(predicadoNombre);
        }

        if (this.getPeriodo() != null) {
            // Crea la expresión para el parámetro Calendar
            Expression<Calendar> fechaInicio = builder.literal(this.getPeriodo().getFechaInicio().getFecha());
            Expression<Calendar> fechaFin = builder.literal(this.getPeriodo().getFechaFin().getFecha());
            // Crea las expresiones para el año, mes y día del parámetro Calendar
            Predicate predicadoPeriodo = builder.between(root.get("fechaInicio"), fechaInicio, fechaFin);
            predicados.add(predicadoPeriodo);
        }

        return predicados;
    }

    public Root<Tramite> getRoot(CriteriaQuery<Tramite> criteria) {
        return criteria.from(Tramite.class);
    }
}
