package org.itson.utils;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public class Periodo {

    /**
     * Fecha Inicio del periodo.
     */
    private Fecha fechaInicio;
    /**
     * Fecha Fin del periodo.
     */
    private Fecha fechaFin;

    /**
     * Constructor único.
     *
     * @param fechaInicio Fecha de inicio a inicializar.
     * @param fechaFin Fecha final a inicializar
     */
    public Periodo(final Fecha fechaInicio, final Fecha fechaFin) {
        if (fechaInicio.getCalendar().after(fechaFin.getCalendar())) {
            String msg = "La fecha de inicio debe"
                    + " ser anterior a la fecha de fin";
            throw new IllegalArgumentException(msg);
        }
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    /**
     * Método que regresa la fecha de inicio.
     *
     * @return Fecha Inicio del periodo.
     */
    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Método que regresa la fecha final.
     *
     * @return Fecha Fin del periodo.
     */
    public Fecha getFechaFin() {
        return fechaFin;
    }

}
