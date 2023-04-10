package org.itson.daos;

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
    public String getNombreTramitante() {
        return nombreTramitante;
    }

    /**
     *
     * @param nombreTramitante
     */
    public void setNombreTramitante(final String nombreTramitante) {
        this.nombreTramitante = nombreTramitante;
    }

}
