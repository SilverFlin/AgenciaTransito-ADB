/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.presentacion;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public class ReporteTramiteDTO {

    private String tipo;
    private String tramitante;
    private String costo;
    private String fechaInicio;

    /**
     * Método constructor que inicializa los atributos de la clase.
     *
     * @param tipo Tipo del trámite.
     * @param tramitante Persona que lo tramitó.
     * @param costo Costo del trámite.
     * @param fechaExpedicion Fecha de expedición del trámite.
     */
    public ReporteTramiteDTO(String tipo, String tramitante, String costo, String fechaExpedicion) {
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
    public void setTipo(String tipo) {
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
    public void setTramitante(String tramitante) {
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
    public void setCosto(String costo) {
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
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

}
