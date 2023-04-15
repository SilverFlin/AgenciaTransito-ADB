package org.itson.daos;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.itson.dominio.Tramite;
import org.itson.utils.Fecha;
import org.itson.utils.Periodo;

/**
 *
 * @author Luis Toledo n Misael Marchena
 * @param <T> Tipo del trámite
 */
public class ParametrosTramitesDTO<T extends Tramite> {

    /**
     * Periodo al que pertenece la realizacion del tramite.
     */
    private Periodo periodo;

    /**
     * Nombre del tramitante, no incluye apellidos y no es necesario que sea un
     * nombre completo.
     */
    private String nombreTramitante;

    /**
     * Clase del tipo del Tramite.
     */
    private Class<T> tipoTramite;

    /**
     * Constructor con todos los filtros.
     *
     * @param periodo periodo del filtro.
     * @param tipoTramite tipo del tramite.
     * @param nombreTramitante nombre parcial del tramitante.
     */
    public ParametrosTramitesDTO(
            final Periodo periodo,
            final Class<T> tipoTramite,
            final String nombreTramitante
    ) {
        this.periodo = periodo;
        this.tipoTramite = tipoTramite;
        this.nombreTramitante = nombreTramitante;
    }

    /**
     * Constructor vacío.
     *
     * @param tipoTramite tipo tramitante
     */
    public ParametrosTramitesDTO(final Class<T> tipoTramite) {
        this.tipoTramite = tipoTramite;
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
     * @param periodo periodo del filtro.
     */
    public void setPeriodo(final Periodo periodo) {
        this.periodo = periodo;
    }

    /**
     *
     * @return Clase del tipo del trámite del filtro, si lo hay.
     */
    public Class<T> getTipoTramite() {
        return tipoTramite;
    }

    /**
     *
     * @param tipoTramite tipo tramitante.
     */
    public void setTipoTramite(final Class<T> tipoTramite) {
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
     * @param nombreTramitante nombre del tramitante.
     */
    public void setNombreTramitante(final String nombreTramitante) {
        this.nombreTramitante = nombreTramitante;
    }

    /**
     *
     * @param builder Builder del CriteriaQuery
     * @param root Root de la consulta
     * @return Lista de los predicados segun los filtros presentes.
     */
    public Predicate[] getPredicados(
            final CriteriaBuilder builder,
            final Root<T> root
    ) {
        List<Predicate> predicados = new LinkedList<>();

        if (this.isNombreTramitante()) {
            Predicate predicadoNombre = getPredicadoNombre(root, builder);
            predicados.add(predicadoNombre);
        }

        if (this.isPeriodo()) {
            Predicate predicadoPeriodo = getPredicadoPeriodo(root, builder);
            predicados.add(predicadoPeriodo);
        }

        return predicados.toArray(Predicate[]::new);
    }

    /**
     *
     * @param builder Builder del CriteriaQuery
     * @return CriteriaQuery segun el tipo de tramite.
     */
    public CriteriaQuery<T> getCriteria(final CriteriaBuilder builder) {
        return builder.createQuery(this.tipoTramite);
    }

    /**
     *
     * @param criteria criteria query.
     * @return Root segun el tipo de tramite.
     */
    public Root<T> getRoot(final CriteriaQuery<T> criteria) {
        return criteria.from(this.tipoTramite);
    }

    private boolean isNombreTramitante() {
        return this.getNombreTramitante() != null
                && !this.getNombreTramitante().isBlank();
    }

    private Predicate getPredicadoNombre(
            final Root<T> root,
            final CriteriaBuilder builder
    ) {
        Expression<String> nombresTramitante
                = root.get("tramitante").get("nombres");

        String nombreConWildcards = "%" + this.getNombreTramitante() + "%";

        return builder.like(nombresTramitante, nombreConWildcards);
    }

    private boolean isPeriodo() {
        return this.getPeriodo() != null;
    }

    private Predicate getPredicadoPeriodo(
            final Root<T> root,
            final CriteriaBuilder builder
    ) {
        Fecha fechaInicio = this.getPeriodo().getFechaInicio();
        Calendar fechaInicioCalendar = fechaInicio.getCalendar();

        Fecha fechaFin = this.getPeriodo().getFechaFin();
        Calendar fechaFinCalendar = fechaFin.getCalendar();

        Expression<Calendar> exprFechaInicio
                = builder.literal(fechaInicioCalendar);
        Expression<Calendar> exprFechaFin
                = builder.literal(fechaFinCalendar);

        return builder.between(
                root.get("fechaInicio"),
                exprFechaInicio,
                exprFechaFin
        );
    }
}
