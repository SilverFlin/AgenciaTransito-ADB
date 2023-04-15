package org.itson.presentacion;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public class ReporteTramiteDTO {

    /**
     * Tipo del trámite.
     */
    private String tipo;
    /**
     * Tramitante.
     */
    private String tramitante;
    /**
     * Costo del tramite.
     */
    private String costo;
    /**
     * Fecha de inicio del trámite.
     */
    private String fechaInicio;

    /**
     * Método constructor que inicializa los atributos de la clase.
     *
     * @param tipo Tipo del trámite.
     * @param tramitante Persona que lo tramitó.
     * @param costo Costo del trámite.
     * @param fechaExpedicion Fecha de expedición del trámite.
     */
    public ReporteTramiteDTO(
            final String tipo,
            final String tramitante,
            final String costo,
            final String fechaExpedicion
    ) {
        this.tipo = tipo;
        this.tramitante = tramitante;
        this.costo = costo;
        this.fechaInicio = fechaExpedicion;
    }

    /**
     * Regresa el tipo del trámite.
     *
     * @return Licencia o Placas.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de trámite.
     *
     * @param tipo Tipo de trámite a establecer.
     */
    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }

    /**
     * Regresa el nombre completo del tramitante del trámite.
     *
     * @return Tramitante.
     */
    public String getTramitante() {
        return tramitante;
    }

    /**
     * Establece el tramitante que realizó el trámite.
     *
     * @param tramitante Tramitante a establecer.
     */
    public void setTramitante(final String tramitante) {
        this.tramitante = tramitante;
    }

    /**
     * Regresa el costo del trámite.
     *
     * @return El costo del trámte.
     */
    public String getCosto() {
        return costo;
    }

    /**
     * Establece el costo del trámite.
     *
     * @param costo Costo a establecer.
     */
    public void setCosto(final String costo) {
        this.costo = costo;
    }

    /**
     * Regresa la fecha de expedición del trámite.
     *
     * @return Fecha de expedición del trámite.
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Establece la fecha de expedición del trámite.
     *
     * @param fechaInicio Fecha de expedición a establecer.
     */
    public void setFechaInicio(final String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

}
