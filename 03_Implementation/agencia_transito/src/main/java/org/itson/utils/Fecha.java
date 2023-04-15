package org.itson.utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public class Fecha {

    /**
     * Fecha actua como wrapper de GregorianCalendar.
     */
    private final GregorianCalendar gregorianCalendar;

    /**
     * Crea la fecha a partir de una instancia de GregorianCalendar.
     *
     * @param fecha Fecha que se desea instanciar.
     */
    public Fecha(final GregorianCalendar fecha) {
        this.gregorianCalendar = fecha;
    }

    /**
     * Crea fecha a partir de año, mes, y día. El constructor se encarga de
     * hacer el ajuste en mes, ya que GregorianCalendar inicia del 0 en los
     * meses.
     *
     * @param anho Año de la fecha.
     * @param mes Mes de la fecha.
     * @param dia Día de la fecha.
     */
    public Fecha(final int anho, final int mes, final int dia) {
        this.gregorianCalendar = new GregorianCalendar(anho, mes - 1, dia);
    }

    /**
     * Método que regresa el año.
     *
     * @return El año.
     */
    public int getAnho() {
        return gregorianCalendar.get(Calendar.YEAR);
    }

    /**
     * Método que regresa el mes.
     *
     * @return El mes ya ajustado.
     */
    public int getMes() {
        return gregorianCalendar.get(Calendar.MONTH) + 1;
    }

    /**
     * Método que regresa el día.
     *
     * @return El día del mes (1-31).
     */
    public int getDia() {
        return gregorianCalendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * Método que establece el año.
     *
     * @param anho el año de la fecha.
     */
    public void setAnho(final int anho) {
        gregorianCalendar.set(Calendar.YEAR, anho);
    }

    /**
     * Método que establece el mes.
     *
     * @param mes el mes de la fecha.
     */
    public void setMes(final int mes) {
        gregorianCalendar.set(Calendar.MONTH, mes - 1);
    }

    /**
     * Método que establece el día.
     *
     * @param dia el día de la fecha.
     */
    public void setDia(final int dia) {
        gregorianCalendar.set(Calendar.DAY_OF_MONTH, dia);
    }

    /**
     * Este se usa para pasar la fecha a la entidad.
     *
     * @return Regresa la instancia de GregorianCalendar.
     */
    public GregorianCalendar getCalendar() {
        return gregorianCalendar;
    }

    /**
     * Ajusta el formato de fecha a DD-MM-YY.
     *
     * @return Fecha con formato DD-MM-YYY
     */
    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", getDia(), getMes(), getAnho());
    }

}
