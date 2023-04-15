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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTramitante() {
        return tramitante;
    }

    public void setTramitante(String tramitante) {
        this.tramitante = tramitante;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    
}
