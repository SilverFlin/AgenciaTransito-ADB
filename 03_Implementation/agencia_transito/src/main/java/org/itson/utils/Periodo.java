package org.itson.utils;

/**
 *
 * @author Toled
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
     * @param fechaInicio
     * @param fechaFin
     */
    public Periodo(final Fecha fechaInicio, final Fecha fechaFin) {
        if (fechaInicio.getFecha().after(fechaFin.getFecha())) {
            String msg = "La fecha de inicio debe"
                    + " ser anterior a la fecha de fin";
            throw new IllegalArgumentException(msg);
        }
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    /**
     *
     * @return Fecha Inicio del periodo.
     */
    public Fecha getFechaInicio() {
        return fechaInicio;
    }

    /**
     *
     * @return Fecha Fin del periodo.
     */
    public Fecha getFechaFin() {
        return fechaFin;
    }

}
